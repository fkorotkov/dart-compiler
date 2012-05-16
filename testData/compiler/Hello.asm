; glibc stuff
extern _puts, _printf, _malloc, _free
 
; static data
segment .data
 
hello_world_str db "Hello world!", 10, 0
 
; code
segment .text
 
global _main
 
_main:
        push ebp ; setup the frame
        mov  ebp, esp
 
        sub  esp, 4 ; align the stack
        push dword hello_world_str
        call _printf

        add  esp, 4 ; cleanup the stack
        mov  esp, ebp
        pop  ebp
        ret