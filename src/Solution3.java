public class Solution3 {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int astart = 0;
        int bstart = 0;
        int aend = nums1.length - 1;
        int bend = nums2.length - 1;
        double median = -1;
        if ((nums1.length + nums2.length) % 2 == 0) {

            while (bend - bstart + aend - astart > 0 && astart <= aend && bstart <= bend) {
                if (nums1[astart] <= nums2[bstart]) {
                    astart++;
                } else {
                    bstart++;
                }
                if (nums1[aend] > nums2[bend]) {
                    aend--;
                } else {
                    bend--;
                }
            }
            while (bend - bstart > 1) {
                bend--;
                bstart++;
            }
            while (aend - astart > 1) {
                aend--;
                astart++;
            }
            if (astart < aend) {
                median=(nums1[astart] + nums1[aend]) / 2.0;
            } else if (astart == aend) {
                median= (nums1[astart] + nums2[bend]) / 2.0;
            } else if (astart > aend) {
                median= (nums2[bstart] + nums2[bend]) / 2.0;
            }
            System.out.printf("%d %d",astart,aend);
            System.out.printf("%d %d",bstart,bend);
        } else {
            while (bend - bstart + aend - astart + 1 > 0 && astart <= aend && bstart <= bend) {
                if (nums1[astart] <= nums2[bstart]) {
                    astart++;
                } else {
                    bstart++;
                }
                if (nums1[aend] > nums2[bend]) {
                    aend--;
                } else {
                    bend--;
                }
            }
            while (bend - bstart > 0) {
                bend--;
                bstart++;
            }
            while (aend - astart > 0) {
                aend--;
                astart++;
            }
            if (astart == aend) {
                median= nums1[astart];
            } else if (bstart == bend) {
                median= nums2[bstart];
            }
            System.out.printf("%d %d",astart,aend);
            System.out.printf("%d %d",bstart,bend);
        }
        return  median;

    }


        public static void main(String[] Args){
            int [] nums1 = {1};
            int [] nums2 = {2,3,4,6};
            System.out.println(findMedianSortedArrays(nums1,nums2));
        }

}
