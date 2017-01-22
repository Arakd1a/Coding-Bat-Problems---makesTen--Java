public boolean makes10(int a, int b) {
  boolean makes10 = false;
  int sum;
  sum = a+b;
  if(sum==10){
    makes10=true;
  } if(a==10){
    makes10=true;
  } if(b==10){
    makes10=true;
  }
  return makes10;
}
