public void BFS(HashMap<Character,LinkedList<Character>> graph,HashMap<Character,I
nteger> dist, char start){
    Queue<Character> q = new LinkedList<>();
    q.add(start);
    dist.put(start,0);
    int i=0;
    while(!q.isEmpty()){
      char top = q.poll();
      i++;
      int d = dist.get(top) + 1;

      for (Character c: graph.get(top)){
        if (!dist.containsKey(c)){
            dist.put(c,d);
            q.add(c);
        }
      }
    }
}

public boolean find(HashMap<Character,LinkedList<Character>> graph ,char start,char end){
    Queue<Character> q = new LinkedList<>();
    q.add(start);

    while(!q.isEmpty()){
        char temp = q.poll();
        for (Character c: graph.get(temp)){
            if (c == end){
                return true;
            }else{
                q.add(c);
            }
        }
    }
    return false;
}

public void find_dfs(HashMap<Character,LinkedList<Character>> graph ,HashMap<Character,Boolean> visited,char start){
    if (!visited.containsKey(start)){
      visited.put(start,true);
      for (Character c: graph.get(start)){
          if (!visited.containsKey(c)){
              find_dfs(graph,visited,c);
          }
      }
    }
}
