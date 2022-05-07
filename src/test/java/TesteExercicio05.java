import easy.Exercicio04;
import easy.Exercicio05;
import org.junit.Assert;
import org.junit.Test;

public class TesteExercicio05 {
                    @Test
                    public void testecalcularSoma() {

                        Exercicio05 exercicio05 = new Exercicio05();
                        Assert.assertEquals(6, exercicio05.calcularSoma(2, 2, 2));
                    }
                    @Test
                    public void testecalcularSubtracao() {
                        Exercicio05 exercicio05 = new Exercicio05();
                        Assert.assertEquals(-2, exercicio05.calcularSubtracao(2, 2, 2));
                    }
                    @Test
                    public void testecalcularMultiplicacao() {
                        Exercicio05 exercicio05 = new Exercicio05();
                        Assert.assertEquals(8, exercicio05.calcularMultiplicacao(2, 2, 2));
                    }
                    @Test
                    public void testecalcularMedia() {
                        Exercicio05 exercicio05 = new Exercicio05();
                        Assert.assertEquals("2.0", String.valueOf(exercicio05.calcularMedia(2,2,2)));
                    }
                    }
