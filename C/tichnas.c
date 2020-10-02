#include <stdio.h>
#include <string.h>

int main() {
  char s[100];
  printf("Hello Sanchit, please enter a string.\n");
  scanf("%s", s);
  printf("Length of string: %d\n", strlen(s));
  return 0;
}