fun preuCuotaVariable(llitres:Float=50f):Float{
    if (llitres<50) return 0.0f
    else (llitres>=50.0 && llitres<=200.0)
        return llitres*0.15f
    return llitres*0.30f
}
fun descomteCuotaVariable(familiaNombrosaMonoParental:Boolean, integrantsFamilia:Int=0, preuCuotaVariable:Float):Float{
    if (!familiaNombrosaMonoParental){
        return preuCuotaVariable-(preuCuotaVariable*(integrantsFamilia))
    }
    if (integrantsFamilia>=5){
        return preuCuotaVariable-(preuCuotaVariable*50)
    }
    return preuCuotaVariable-(preuCuotaVariable*(integrantsFamilia*10))

}