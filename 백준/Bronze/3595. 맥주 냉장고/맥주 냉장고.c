#include <stdio.h>

int main()
{
	int n;
	int min = 100000000;
	int a, b, c;
	int area;

	scanf("%d", &n);

	for (int i = 1; i <= n; i++)	//세 곱의 합이 N과 같은 세 수를 분별하는 과정
	{
		if (n % i == 0)
		{
			for (int j = 1; j <= n / i; j++)
			{
				if (n % (i * j) == 0)
				{
					for (int k = 1; k <= n / (i * j); k++)
					{
						if (i * j * k == n)
						{
							area = (i * j + j * k + i * k) * 2; //세 수로 이루어진 직육면체 겉넓이를 구하고
							if (area < min) //겉넓이가 최솟값인 세 수를 저장한다
							{
								min = area;
								a = i;
								b = j;
								c = k;
							}
						}
					}
				}
			}
		}
	}
	printf("%d %d %d\n", a, b, c);
}