package org.dartlang.compile;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class TemporaryVariableManager {
    private int count = 0;
    private final Set<Variable> variables = new HashSet<Variable>();

    public Variable hold() {
        if (variables.isEmpty()) {
            variables.add(new Variable("tmp" + count));
            ++count;
        }
        return variables.iterator().next();
    }

    public void release(Variable variable) {
        variables.add(variable);
    }

    public Collection<Variable> getAllVariables() {
        return variables;
    }

    public static class Variable {
        private final String name;

        public Variable(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Variable variable = (Variable) o;

            if (!name.equals(variable.name)) return false;

            return true;
        }

        @Override
        public int hashCode() {
            return name.hashCode();
        }
    }
}