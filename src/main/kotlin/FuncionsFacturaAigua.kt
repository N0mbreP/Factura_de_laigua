/**
 * la funcio preuCuotaVariable serveix per aplicar el preu segons la cuantitat de llitres utilitçats
 * @author pol paredes
 * @since 10/1/2024
 *@param llitres , es la cuantitat de llitres utilitzats (Float)
 * @return preuFinal (Float)
 */
fun preuCuotaVariable(llitres:Float=50f):Float{
    if (llitres<50) return 0.0f
    else if (llitres>=50.0 && llitres<=200.0) return llitres*0.15f
    return llitres*0.30f
}
/**
 * la funcio descomteCuotaVariable serveix per aplicar els descomptes de familia nombrosa/monoparental i el bo social
 * @author pol paredes
 * @since 10/1/2024
 *@param llitres , es la cuantitat de llitres utilitzats (Float)
 * @return preuFinal (Float)
 */
fun descomteCuotaVariable(familiaNombrosaMonoParental:Boolean=false, integrantsFamilia:Int=0, preuCuotaVariable:Float):Float{
    if (!familiaNombrosaMonoParental){
        return preuCuotaVariable*(100.0f/80.0f)
    }else if (integrantsFamilia>=5){
        return preuCuotaVariable*(100.0f/50.0f)
    }
    return preuCuotaVariable*(100.0f/(integrantsFamilia*10.0f))
}