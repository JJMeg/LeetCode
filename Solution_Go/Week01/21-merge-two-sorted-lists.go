/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func mergeTwoLists(l1 *ListNode, l2 *ListNode) *ListNode {
    if l1 == nil {
        return l2
    }
    if l2 == nil {
        return l1
    }

    var head,h *ListNode
    if l1.Val > l2.Val{
        head = l2
        l2 = l2.Next
    }else{
        head = l1
        l1 = l1.Next
    }
    h = head

    for{
        if l1 == nil || l2 == nil {
            break
        }
        if l1.Val < l2.Val {
            head.Next = l1
            head = head.Next
            l1 = l1.Next
        }else{
            head.Next = l2
            head = head.Next
            l2 = l2.Next
        }
    }

    if l1 != nil {
        head.Next = l1
    }
    if l2 != nil {
        head.Next = l2
    }

    return h
}
