import org.example.readFloat
import org.example.readInt

fun main() {
    val llitres:Float= readFloat(pMessageIn = "Hola, siusplau introdueix la cuantitat " +
            "de llitres d'aigua que has utilitzat", pMessageErrorDT = "Siusplau introdueix un numero amb decimals")
    var preuPagar:Float=preuCuotaVariable(llitres = llitres)
    var descomte:Int= readInt(pMax = 5, pMin = 0, pMessageIn = "Tria l'opcio adient al teu cas,\n" +
            " 0. Ningun descomte \n 1. Familia monoparental \n 2. Familia nombrosa \n 3. Bo social " +
            "\n 4. Familia monoparental amb bo social \n 5. Familia nombrosa amb bo social ",
        pMessageErrorDT = "Siusplau introdueix una opcio de les habilitades",
        pMessageErrorDV = "Siusplau introdueix una opcio de les habilitades")
    when(descomte){
        1,2-> preuPagar=descomteCuotaVariable(integrantsFamilia = readInt("Siusplau introdueix el " +
                "nombre d'integrants de l'unitat familiar",
            pMessageErrorDT = "Siusplau introdueix la cuantitat d'integrants de forma numerica")
            , familiaNombrosaMonoParental = true, preuCuotaVariable = preuPagar)
        3,4,5-> preuPagar=descomteCuotaVariable(preuCuotaVariable = preuPagar)
        else-> preuPagar=preuPagar
    }
    when(descomte){
        1,2-> println("Unicament s'ha aplicat a la cuota variable el descompte tant com per a" +
                " families nombroses com monoparentals de 10% menys per persona fins un maxim del 50%.\n" +
                "Quedant amb 6€ de quota fixa, la quota variable es $preuPagar€ i d'import total queda " +
                "${preuPagar +6}€")
        3,4,5-> println("S'ha a aplicat el descomte de bo social que te un descompte de la cuota variable del 80% " +
                "i una reduccio de la quota fixa de 3€ .\nQuedant amb 3€ de quota fixa, la quota variable es " +
                "$preuPagar€ i d'import total queda ${preuPagar+3}€")
        else-> println("NO s'ha aplicat cap descomte.\nLa quota fixa es d'un total de 6€ , la quota variable" +
                " es de $preuPagar€ i d'import total queda ${preuPagar + 6}€")
    }
}