; Hola Mundo
; Programa que imprime "Hola Mundo" en la consola
; Autor: [Juan Cisneros]
; Fecha: [2025-03-25]
; Lenguaje: Ensamblador x86
; Version: 1.0
; Compilador: MASM32 o TASM32
; Requiere el compilador MASM32 o TASM32 para ensamblar y enlazar
; Requiere un sistema operativo DOS o emulador como DOSBox para ejecutar el programa
; Descripcion: Este programa utiliza la interrupcion 21H para imprimir el mensaje "Hola Mundo" en la consola


; Declaracion de Constantes
CR EQU 13 ; Constante para el retorno de carro
LF EQU 0AH ; Consteante para el salto de linea

; Declaracion de Segmento de Datos
DATOS SEGMENT ;Inicio del segmento de datos
    MENSAJE DB CR, LF, 'Hola Mundo', CR, LF, '$' ; Definicion del mensaje a imprimir
DATOS ENDS ;Fin del segmento de datos

; Declaracion de Segmento de Pilas
PILA SEGMENT STACK ;Inicio del segmento de pilas
    DB 64 DUP('PILA') ; Reserva espacio para la pila
PILA ENDS ;Fin del segmento de pilas

; Declaracion de Segmento de Codigo
CODE SEGMENT ;Inicio del segmento de codigo
    Hola_Mundo PROC FAR ;Inicio procedimiento Hola_Mundo
        ASSUME CS:CODE, DS:DATOS, SS:PILA ; Asignacion de segmentos
        MOV AX, DATOS ; Cargar el segmento de datos en AX
        MOV DS, AX ; Mover el segmento de datos a DS
        LEA DX, MENSAJE ; Cargar la direccion del mensaje en DX
        MOV AH, 09H ; Función para imprimir cadena de caracteres
        INT 21H ; Interrupcion para imprimir el mensaje
        MOV AH, 4CH ; Función para salir del programa
        INT 21H ; Interrupcion para salir
    Hola_mundo ENDP ;Fin del procedimiento Hola_Mundo
CODE ENDS ;Fin del segmento de codigo

END Hola_Mundo ;Fin del programa y punto de entrada

