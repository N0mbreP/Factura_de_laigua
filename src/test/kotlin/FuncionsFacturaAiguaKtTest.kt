import kotlin.test.Test
import kotlin.test.assertEquals

class FuncionsFacturaAiguaKtTest {
    //Proves a la funcio preuCuotaVariable
    @Test
    fun llitresInferiors50() {
        assertEquals(expected = 0f, preuCuotaVariable(39.0f)) // esperat 0f
    }
    @Test
    fun llitresInferiors200() {
        assertEquals(expected = 15.000001f, preuCuotaVariable(100f)) // esperat 15f
        assertEquals(expected = 30.000002f, preuCuotaVariable(200f)) // esperat 30f
    }
    @Test
    fun llitresSuperiors200() {
        assertEquals(expected = 150f, preuCuotaVariable(500f)) // esperat 150f
    }

    //Proves a la funcio descomteCuotaVariable
    @Test
    fun comprovarMonoparental(){
        //7 Integrants
        assertEquals(expected = 50f, descomteCuotaVariable(preuCuotaVariable = 100f, familiaNombrosaMonoParental = true,
            integrantsFamilia = 7) )
        //3 Integrants
        assertEquals(expected = 30f, descomteCuotaVariable(preuCuotaVariable = 100f, familiaNombrosaMonoParental = true,
            integrantsFamilia = 3) )
    }
}
