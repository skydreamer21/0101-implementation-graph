package graph.adjlist.weighted;
import java.util.ArrayList;

public class UndirectedGraph {
    ArrayList<Node>[] adjList;
    
    public UndirectedGraph(int size) {
    	//TODO : 생성자 구현 -> adjList 초기화
    	
    }
    
    public void addEdge(int v1, int v2, int weight) {
    	//TODO : 간선 추가 메서드 구현
    	
    }
    
    // 노드 번호와 weight를 저장하는 클래스 생성
    static class Node {
    	int nodeNumber;
        int weight;
        
    	public Node() {
    		// TODO: 생성자 만들기 -> 파라미터 추가 필요!
    		
    	}
    }
}
