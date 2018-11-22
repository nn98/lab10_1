package lab10_1;

public class DirectedMatrixGraph {
	private int[][] m;
	private int n;
	public DirectedMatrixGraph(int i) {
		this.m=new int[i*i][i*i];
		this.n=i;
	}
	public boolean hasEdge(int a,int b) {
		if(m[a][b]==1) return true;
		else return false;
	}
	public void addEdge(int a,int b) {
		if(m[a][b]==1) System.out.println("간선 삽입 오류 - 이미 존재하는 간선입니다. <"+a+", "+b+">");
		else if(a>=n||b>=n) System.out.println("간선 삽입 오류 - 잘못된 정점 번호입니다. <"+a+", "+b+">");
		else m[a][b]=1;
	}
	public void printAdjacentVertices(int i) {
		//System.out.print("\n정점 "+i+"에 인접한 정점 = ");
		for(int j=0;j<m[i].length;j++) if(hasEdge(i,j)) System.out.print(j+" ");
		System.out.print("\n");
	}
	public void printing() {
		for(int i=0;i<m.length;i++) {
			System.out.print("\n정점 "+i+"에 인접한 정점 = ");
			for(int j=0;j<m[i].length;j++) {
				if(m[i][j]==1) System.out.print(j+" ");
			}
		}
	}
}