public class Variables {
int var = 10;
public Variables(int var) {
this.var = var;
}
public void method() {
int localVar = 20;
// ...
{
int blockVar = 30;
localVar = blockVar;
}
lockVar = 10; /* blad kompilacji - zmienna niedostepna */
}
}