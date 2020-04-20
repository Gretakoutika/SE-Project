#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  float a[n];
  float sum=0;
  float x=0;
  for(int i=0;i<n;i++)
  {
    printf("enter %d amount",i);
    scanf("%f",&a[i]);
    sum=sum+a[i];
    x=sum/n;
  }
  return 0;
 }
