package Day3.multilevel;

 class A {
     void add(){
      return;
     }
}
class B extends A {
     void sub(){
      return;
     }

}
class C extends B{
  void mul(){
   return;
  }
}
class DriverCode{
  A oa = new A();
  B ob = new B();
  C oc = new C();

 }
