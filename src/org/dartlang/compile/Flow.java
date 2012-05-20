package org.dartlang.compile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Flow {
    private final Map<String, TemporaryVariableManager.Variable> id2var = new HashMap<String, TemporaryVariableManager.Variable>();

    public Flow() {

    }

    public Flow(Flow flow) {
        for (String name : flow.id2var.keySet()) {
            addVar(name, flow.getVar(name));
        }
    }

    public TemporaryVariableManager.Variable getVar(String name) {
        return id2var.get(name);
    }

    public void addVar(String name, TemporaryVariableManager.Variable variable) {
        id2var.put(name, variable);
    }

    public TemporaryVariableManager.Variable releaseVar(String name) {
        return id2var.remove(name);
    }

    public List<TemporaryVariableManager.Variable> resetTo(Flow oldFlow) {
        final List<TemporaryVariableManager.Variable> result = new ArrayList<TemporaryVariableManager.Variable>(
                oldFlow.id2var.values());
        result.removeAll(id2var.values());
        id2var.clear();
        id2var.entrySet().addAll(oldFlow.id2var.entrySet());
        return result;
    }
}
