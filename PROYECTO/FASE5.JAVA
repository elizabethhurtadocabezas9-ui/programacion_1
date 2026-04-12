Algoritmo Fase5_Alertas

Var
    rutasConAlerta : entero
    nombreRuta : texto
    pasajeros, vueltas, retraso : entero
    recaudo : real
    alertaDemanda, alertaVueltas, alertaRetraso, alertaRecaudo : booleano
    tieneAlerta : booleano
    ruta : entero

Inicio

    rutasConAlerta <- 0

    Para ruta <- 1 Hasta 3 Hacer

        // NOMBRE DE LA RUTA
        Si ruta = 1 Entonces
            nombreRuta <- "T31"
        Sino
            Si ruta = 2 Entonces
                nombreRuta <- "A10"
            Sino
                nombreRuta <- "P22A"
            FinSi
        FinSi

        Escribir "--- Analisis ruta: ", nombreRuta, " ---"

        Escribir "Pasajeros del dia:"
        Leer pasajeros

        Escribir "Vueltas realizadas:"
        Leer vueltas

        Escribir "Minutos de retraso:"
        Leer retraso

        Escribir "Recaudo del dia:"
        Leer recaudo

        // ALERTAS
        alertaDemanda <- (pasajeros < 500)
        alertaVueltas <- (vueltas > 20)
        alertaRetraso <- (retraso > 90)
        alertaRecaudo <- (recaudo < (pasajeros * 1500 * 0.70))

        // COMBINACION
        tieneAlerta <- alertaDemanda O alertaVueltas O alertaRetraso O alertaRecaudo

        Si NO tieneAlerta Entonces
            Escribir "Ruta ", nombreRuta, ": OK"
        Sino
            rutasConAlerta <- rutasConAlerta + 1
            Escribir "Ruta ", nombreRuta, ": ALERTA DETECTADA"

            // MOSTRAR SOLO LAS ALERTAS ACTIVAS
            Si alertaDemanda Entonces
                Escribir "- Baja demanda de pasajeros"
            FinSi

            Si alertaVueltas Entonces
                Escribir "- Exceso de vueltas"
            FinSi

            Si alertaRetraso Entonces
                Escribir "- Retraso mayor a 90 minutos"
            FinSi

            Si alertaRecaudo Entonces
                Escribir "- Recaudo sospechosamente bajo"
            FinSi

        FinSi

    FinPara

    // DIAGNOSTICO GLOBAL
    Escribir "Rutas con alertas: ", rutasConAlerta, " de 3"

    Si rutasConAlerta = 0 Entonces
        Escribir "Operacion del dia: NORMAL"
    Sino
        Si rutasConAlerta = 1 Entonces
            Escribir "Operacion del dia: REVISION MENOR"
        Sino
            Si rutasConAlerta = 2 Entonces
                Escribir "Operacion del dia: REVISION URGENTE"
            Sino
                Escribir "Operacion del dia: CRITICA - Notificar a Movilidad"
            FinSi
        FinSi
    FinSi

FinAlgoritmo