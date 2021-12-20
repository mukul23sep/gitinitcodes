#include <stdio.h>
int main()
{
    int t;
    scanf("%d", &t);
    while (t--)
    {
        int a, res = 0;
        scanf("%d", &a);
        while (a >= 10)
        {
            res += (a % 10);
            a = a / 10;
        }
        res += a;
        printf("%d\n", res);
    }
    return 0;
}