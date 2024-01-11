<h1 align="center">Factura de l'aigua</h1>
<p align="center"><img src="https://s2.abcstatics.com/abc/www/multimedia/ciencia/2023/06/09/nature-water-drops-of-water-liqsd-U30085318806ZtH-1200x630@abc.jpg"/></p> 

## Index:
---

- [Explicació del algoritme](#Explicació-del-algoritme)
- [Explicació del calcul del cost](#Explicació-del-calcul-del-cost)
- [Funcions destaquades del algoritme](#Funcions-destaquades-del-algoritme)
- [Autor](#autor)

## Explicació del algoritme
---
En aquest repositori hi ha un algoritme que calcula el cost de la factura de l’aigua en funció dels litres consumits i altres elements.
### Explicació del calcul del cost
El cost es calcularà de la següent manera:
- La quota fixa mensual és de 6€ de manteniment.
- Si el consum de l’aigua és menor de 50 litres al mes, no es paga quota variable.
- Si el consum d’aigua es troba entre 50 i 200 litres, es paga 0.15€/litre.
- Si el consum és major de 200 litres, es paga el litre a 0.30€/litre.
- Si és família nombrosa o monomarental: descompte de 10*número_de_membres (amb un màxim del 50% de descompte), sobre el consum (no sobre la quota fixa).
- Si el client té un bo social: descompte del 80% sobre el consum (no sobre la quota fixa) i reducció de la quota fixa a 3€
- Els descomptes no son acumulables, sempre es tindrà en compte el que més beneficiï al client.
- Al final, l'aplicació ha de mostrar de forma desglossada el cost de la quota fixa, el consum de litres d'aigua i el cost que li ha suposat (indicant el preu que se li ha aplicat) i els descomptes dels que s'ha pogut beneficiar.

### Funcions destaquades del algoritme:
---
Les dues funcions destacades son les seguents preuCuotaVariable i descomteCuotaVariable , les cuals estan en el arxiu [FuncionsFacturaAigua.kt](https://github.com/N0mbreP/Factura_de_laigua/blob/main/src/main/kotlin/FuncionsFacturaAigua.kt)

- Funcio preuCuotaVariable :
![image](https://github.com/N0mbreP/Factura_de_laigua/assets/109170634/420f81c7-c1ed-474b-8c35-5a214590d753)

- Funcio descomteCuotaVariable :
![image](https://github.com/N0mbreP/Factura_de_laigua/assets/109170634/29c989c2-1c6e-4066-a218-9fbfd0e6d6a4)


## Autor
---
[Pol Paredes (N0mbreP)](https://github.com/N0mbreP), s'han utilitzat les llibreries [Utilities.kt](https://github.com/N0mbreP/Factura_de_laigua/blob/main/src/main/kotlin/Utilities.kt) i [ConsoleColors.kt](https://github.com/N0mbreP/Factura_de_laigua/blob/main/src/main/kotlin/ConsoleColors.kt) creades per [raimonizard](https://github.com/raimonizard)
