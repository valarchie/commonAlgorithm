package linklists;

/**
 * description: 计算链表代表的数字
 *
 * @author: valarchie
 * on: 2020/5/1
 * @email: 343928303@qq.com
 */
public class SumTwoLinkList {

    public static void main(String[] args) {


        LinkNode x1 = new LinkNode(3);
        LinkNode x2 = new LinkNode(1);
        LinkNode x3 = new LinkNode(5);

        x1.setNext(x2).setNext(x3);

        LinkNode y1 = new LinkNode(5);
        LinkNode y2 = new LinkNode(9);
        LinkNode y3 = new LinkNode(2);

        y1.setNext(y2).setNext(y3);

        LinkNode sum = sumTwoLinkList(x1, y1);

        sum.printList();

    }


    /**
     * 将链表代表的数字进行相加即可，注意首位代表的是个位
     *
     * @param num1 3—>1->5  代表513
     * @param num2 5->9->2  代表295
     * @return 输出最终计算结果 8->0->8
     */
    public static LinkNode sumTwoLinkList(LinkNode num1, LinkNode num2) {

        // 如果其中一个链表为空的，直接当做0处理，返回另外一个链表
        if (num1 == null) {
            return num2;
        }

        if (num2 == null) {
            return num1;
        }

        LinkNode sum = new LinkNode();

        // 保存头结点，如果计算完成后直接返回头结点
        LinkNode head = sum;
        // 是否进位
        boolean isOver = false;
        // 当两个节点，其中一个存在时，即可进行累加
        while (num1 != null || num2 != null) {
            // 默认初始化为0
            int num1Val = 0;
            int num2Val = 0;

            if (num1 != null) {
                num1Val = num1.value;
            }

            if (num2 != null) {
                num2Val = num2.value;
            }
            // 如果进位的话 多加1
            int singleSum = num1Val + num2Val + (isOver == true ? 1 : 0);

            if (singleSum >= 10) {
                isOver = true;
                singleSum = singleSum % 10;
            } else {
                isOver = false;
            }

            sum.value = singleSum;

            num1 = num1 != null ? num1.next : null;

            num2 = num2 != null ? num2.next : null;

            // 没有数字相加，直接结束
            if (num1 == null && num2 == null) {
                break;
            } else {
            // 还有数字相加的话 提前生成下个数字
                sum.next = new LinkNode();
                sum = sum.next;

            }

        }

        return head;

    }


}