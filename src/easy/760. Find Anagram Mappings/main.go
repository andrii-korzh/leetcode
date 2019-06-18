func anagramMappings(A []int, B []int) []int {
  for i:=0; i<len(A); i++{
    for j:=0; j<len(B); j++{
      if A[i] == B[j]{
        A[i] = j
        break
      }
    }
  }
  
  return A;
}