# Bài toán Mã đi tuần:

Cho bàn cờ có kích thước n x n (có n mũ 2 ô). Một quân mã được đặt tại ô ban đầu có toạ độ x0, y0 và được phép dịch chuyển theo luật cờ thông thường. Bài toán đặt ra là từ ô ban đầu, tìm một chuỗi các nước đi của quân mã, sao cho quân mã này đi qua tất cả các ô của bàn cờ, mỗi ô đúng 1 lần.
Như đã nói ở trên, quá trình thử - sai ban đầu được xem xét ở mức đơn giản hơn. Cụ thể, trong bài toán này, thay vì xem xét việc tìm kiếm chuỗi nước đi phủ khắp bàn cờ, ta xem xét vấn đề đơn giản hơn là tìm kiếm nước đi tiếp theo của quân mã, hoặc kết luận rằng không còn nước đi kế tiếp thỏa mãn. Tại mỗi bước, nếu có thể tìm kiếm được 1 nước đi kế tiếp, ta tiến hành ghi lại nước đi này cùng với chuỗi các nước đi trước đó và tiếp tục quá trình tìm kiếm nước đi. Nếu tại bước nào đó, không thể tìm nước đi kế tiếp thỏa mãn yêu cầu của bài toán, ta quay trở lại bước trước, hủy bỏ nước đi đã lưu lại trước đó và thử sang 1 nước đi mới. Quá trình có thể phải thử rồi quay lại nhiều lần, cho tới khi tìm ra giải pháp hoặc đã thử hết các phương án mà không tìm ra giải pháp. 

```c
#include<stdio.h>
#define maxn 10
void ThuNuocTiepTheo(int i, int x, int y, int *q);
void InBanco(int n);
void XoaBanco(int n);
int Banco[maxn][maxn];
int dx[8]={2,1,-1,-2,-2,-1,1,2};
int dy[8]={-1,-2,-2,-1,1,2,2,1};
int n=8;
void ThuNuocTiepTheo(int i, int x, int y, int *q)
{
    int k, u, v;
    int *q1;
    k=0;
    do {
		int *q1 = 0;
        u=x+dx[k];
        v=y+dy[k];
		if  ((0 <= u) && (u<n) && (0 <= v) && (v<n) && (Banco[u][v]==0)) {
			Banco[u][v]=i;
			if (i<n*n) {
				ThuNuocTiepTheo(i+1, u, v, q1);
				if ((*q1)==0) Banco[u][v]=0;
			} else (*q1)=1;
		}
        k++;
	} while (((*q1)==0) && (k<8));
	*q=*q1;
}

void InBanco(int n){
    int i, j;
    for (i=0;i<=n-1;i++){
        for (j=0;j<=n-1;j++)
            if (Banco[i][j]<10) printf("%d   ",Banco[i][j]);
            else printf("%d  ",Banco[i][j]);
			printf("\n\n");
       }
}

void XoaBanco(int n){
    int i, j;
    for (i=0;i<=n-1;i++)
        for (j=0;j<=n-1;j++) Banco[i][j]=0;
}
int main()
{
    int *q=0;
    printf("Cho kich thuoc ban co: ");
    scanf(" %d",&n);
    XoaBanco(n);
    Banco[0][0]=1;
    ThuNuocTiepTheo(2,0,0,q);
    printf("\n Ket qua: \n\n");
    InBanco(n);
    return 0;
}}

```
