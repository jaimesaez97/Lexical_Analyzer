
```
Identificador -> Letra (Letra | Dígito | _ )*
Entero -> [+ | -] DígPos (Dígito)*
Real -> Entero [ Decimal | Exponencial | Decimal Exponencial]
Decimal -> . (Dígito)* DígPos
Exponencial -> [e | E] Entero
Cadena -> " Caracter "
Ignorable -> [\b | \r | \n | # (Caracter)* ]

Letra -> [ a | b | .. | z | A | B | .. | Z ]
DígPos -> [ 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 ]
Dígito -> [0 | DígPos ]
Caracter -> Letra - Ignorable ¿?
```

**Sintaxis**

```
Programa -> [ Sd && | \e] Si
Sd -> Dec ; (Sd)*
Dec -> var tipo Identificador
Dec -> type tipo
Dec -> proc Identificador Parámetros Bloque
Parámetros -> ( Parámetro (, Parámetro*) ) 
Parámetro -> tipo [& | \e] Identificador
```

**Tipos**

```
Tipo -> int | real | bool | string
Tipo -> Identificador
Tipo -> array [ Entero ] of tipo
Tipo -> record { Campo (; Campo)* }
Campo -> tipo Identificador
Tipo -> pointer Tipo
```

**Instrucciones**

```
Si -> Ins (; Ins)*
Ins -> E0 = E0
Ins -> if E0 then Si endif
Ins -> if E0 then Si else Si endif
Ins -> while E0 do Si endwhile
Ins -> read E0
Ins -> write E0
Ins -> nl
Ins -> new E0
Ins -> delete E0
Ins -> call Identificador Parámetros
Ins -> bloque
```

**Bloque**

```
Bloque -> { Programa }
```

**Expresiones**

```
E0 -> E1 + E0 | E1 - E1 | E1
E1 -> E1 and E2 | E1 or E2 | E2
E2 -> E2 op E3 | E3
E3 -> E4 * E4 | E4 / E4 | E4 % E4 | E4
E4 -> - E5 | not E4 | E5
E5 -> [ E0 ] | . Identificador | -> Identificador | E6
E6 -> * E6 | E7
E7 -> numInt | numReal | true | false | string | Identificador | null

op -> < | > | <= | >= | == | !=
```