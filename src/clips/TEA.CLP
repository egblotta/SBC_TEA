(import sbc_tea.modelo.*)

(deftemplate Paciente (declare (from-class Paciente)))

(defrule diagnostico-autismo
    (Paciente    
    (edad ?ed &:(<= ?ed 3))
    (sexo ?sexo)
    (difcomu1 ?dComu1)
    (difsoc1 ?dSoc1)
    (difsoc2 ?dSoc2)
    )
    =>
    ;(printout t "El paciente tiene un posible trastorno autista" crlf)
    (assert (respuesta El paciente tiene un posible trastorno autista))
)

(defrule diagnostico-asperger
    (Paciente 
    (edad ?ed) 
    (sexo ?sexo)
    (difcomu3 $difComu3)
    (difsoc3 $difSoc3)
    (difsoc4 $difSoc4)
    (difsoc5 $difSoc5)
    (difcomu4 $difComu4)
    )
    =>
    ;(printout t "El paciente tiene un posible trastorno de Asperger" crlf)
    (assert (respuesta El paciente tiene un posible trastorno de Asperger))
)

(defrule diagnostico-rett
    (Paciente
    (edad ?ed) 
    (sexo ?sexo &:(eq ?sexo "femenino"))
    (difcomp1 $difComp1)
    (difcomu2 $difComu2)
    (difcomp2 $difComp2)
    (difcomp3 $difComp3)
    )
    =>
    ;(printout t "El paciente tiene un posible trastorno de Rett" crlf)
    (assert (respuesta El paciente tiene un posible trastorno de Rett))
)

(defrule diagnostico-heller
    (Paciente 
    (edad ?edad &:(and(< ?edad 10)(> ?edad 3 )))
    (difcomp1 $difComp1)
    (difcomp5 $difComp5)
    (difcomu5 $difComu5)
    )
    =>
    ;(printout t "El paciente tiene un posible trastorno de Heller" crlf)
    (assert (respuesta El paciente tiene un posible trastorno de Heller))
)


