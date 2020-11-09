(import sbc_tea.modelo.*)

(deftemplate Paciente (declare (from-class Paciente)(include-variables TRUE)))

(defrule diagnostico-autismo
    (Paciente    
    (edad ?ed &:(<= ?ed 3))
    (sexo ?sexo)
    (difcomu1 ?dComu1 &:(eq ?dComu1 TRUE))
    (difsoc1 ?dSoc1 &:(eq ?dSoc1 TRUE))
    (difsoc2 ?dSoc2 &:(eq ?dSoc2 TRUE))
    )
    =>
    (printout t "El paciente tiene un posible trastorno autista" crlf)
    (assert (respuesta El paciente tiene un posible trastorno autista))
)

(defrule diagnostico-asperger
    (Paciente 
    (edad ?ed) 
    (sexo ?sexo)
    (difcomu3 ?dComu3 &:(eq ?dComu3 TRUE))
    (difsoc3 ?dSoc3 &:(eq ?dSoc3 TRUE))
    (difsoc4 ?dSoc4 &:(eq ?dSoc4 TRUE))
    (difsoc5 ?dSoc5 &:(eq ?dSoc5 TRUE))
    (difcomu4 ?dComu4 &:(eq ?dComu4 TRUE))
    )
    =>
    (printout t "El paciente tiene un posible trastorno de Asperger" crlf)
    (assert (respuesta El paciente tiene un posible trastorno de Asperger))
)

(defrule diagnostico-rett
    (Paciente
    (edad ?ed)  
    (sexo ?sexo)
    (difcomp1 ?dComp1 &:(eq ?dComp1 TRUE))
    (difcomu2 ?dComu2 &:(eq ?dComu2 TRUE))
    (difcomp2 ?dComp2 &:(eq ?dComp2 TRUE))
    (difcomp3 ?dComp3 &:(eq ?dComp3 TRUE))
    )
    =>
    (printout t "El paciente tiene un posible trastorno de Rett" crlf)
    (assert (respuesta El paciente tiene un posible trastorno de Rett))
)

(defrule diagnostico-heller
    (Paciente 
    (edad ?edad &:(and(< ?edad 10)(> ?edad 3 )))
    (difcomp1 ?dComp1 &:(eq ?dComp1 TRUE))
    (difcomp5 ?dComp5 &:(eq ?dComp5 TRUE)) 
    (difcomu5 ?dComu5 &:(eq ?dComu5 TRUE))
    )
    =>
    (printout t "El paciente tiene un posible trastorno de Heller" crlf)
    (assert (respuesta El paciente tiene un posible trastorno de Heller))
)

(defrule diagnostico-generico
    (Paciente 
    (edad ?edad)
    (sexo ?sexo)
    )
    =>
    ;(printout t "Los sintomas clinicos son demasiados heterogeneos" crlf)
    ;(assert (respuesta Los sintomas clinicos son demasiados heterogeneos))
)
