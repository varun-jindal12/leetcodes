import com.sun.corba.se.impl.orb.ParserTable;
import com.sun.org.apache.regexp.internal.RE;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Hello World!");
        /*HammingDistance hd = new HammingDistance();
        int distance = hd.hammingDistance(5,4);
        System.out.println(distance);*/

        /*ArrayPartition ap = new ArrayPartition();
        int[] arrayPair = {1,4,3,2};
        int sum = ap.arrayPairSum(arrayPair);
        System.out.println(sum);*/

        /*NumberComplement nc = new NumberComplement();
        int complement = nc.findComplement(5);
        System.out.println(complement);*/

        /*FizzBuzz fb = new FizzBuzz();
        List<String> fizzBuzz = fb.fizzBuzz(15);
        System.out.println(fizzBuzz);*/

        /*SingleNumber sn = new SingleNumber();
        int nums[] = {1,2,4,5,7,1,2,4,7};
//                {2,2,1};
//                {1,2,4,5,7,1,2,4,7};
        int singleNumber = sn.singleNumber(nums);
        System.out.println(singleNumber);*/

        /*IntegerSum is = new IntegerSum();
        int sum = is.getSum(5,7);
        System.out.println(sum);*/

        /*MoveZeroes mz = new MoveZeroes();
        int array[] = {0, 1, 0, 3, 12};
        mz.moveZeroes(array);
        System.out.println(array.toString());*/

        /*ExcelTitle excelTitle = new ExcelTitle();
        int num = excelTitle.titleToNumber("AAA");
        System.out.println(num);*/

        /*MajorityElement majorityElement = new MajorityElement();
        int numArray[] = {1,4,4,4,4,2,3};
//                {1,2,2,2,3};
        int majorElement = majorityElement.majorityElement(numArray);
        System.out.println(majorElement);*/

        /*FirstUnique firstUnique = new FirstUnique();
        String str = "cc";
        int pos = firstUnique.firstUniqChar(str);
        System.out.println(pos);*/

        /*HappyNumbers happyNumbers = new HappyNumbers();
        boolean result = happyNumbers.isHappy(7);
        System.out.println(result);*/

        /*ValidNumber validNumber = new ValidNumber();
        boolean result = validNumber.isNumber("3");
        System.out.println(result);*/

        /*RomanToInt romanToInt = new RomanToInt();
        int integer = romanToInt.romanToInt("MMMXLV");
        System.out.println(integer);*/

        /*ValideAnagram valideAnagram = new ValideAnagram();
        boolean result = valideAnagram.isAnagram("anagram","nagaram");
        System.out.println(result);*/

        /*DublicateInteger dublicateInteger = new DublicateInteger();
        int nums[] = {3,1};
        boolean result = dublicateInteger.containsDuplicate(nums);
        System.out.println(result);*/

        /*ArrayIntersection arrayIntersection = new ArrayIntersection();
        int nums1[] = {1,2,2,1}, nums2[] = {2,2,1};
        int result[] = arrayIntersection.intersect(nums1,nums2);
        System.out.println(Arrays.toString(result));*/

        /*MissingNumber missingNumber = new MissingNumber();
        int nums[] = {6,2,4,3,1,0};
        System.out.println(missingNumber.missingNumber(nums));*/

        /*ReverseInteger reverseInteger = new ReverseInteger();
        System.out.println(reverseInteger.reverse(9646324351));*/

       /* BinaryTree tree = new BinaryTree();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        tree.inOrder(tree.root);*/

       /*HammingWeight hammingWeight = new HammingWeight();
       System.out.println(hammingWeight.hammingWeight(  11));*/

       /*LargestSubArray largestSubArray = new LargestSubArray();
       int[] sums = {-2,-4,-1};
//               {-2,1,-3,4,-1,2,1,-5,4};
       System.out.println(largestSubArray.maxSubArray(sums));*/

       /*HouseRobber houseRobber = new HouseRobber();
       int nums[] = {2,1,1,2};
       System.out.println(houseRobber.rob(nums));*/

       /*ReverseWords reverseWords = new ReverseWords();
       String str = "My name is varun jindal";
       System.out.println(reverseWords.reverseWords(str));*/

      /* AnagramMap anagramMap = new AnagramMap();
       int[] A = {2,5,3,4},B = {3,4,5,2};
       System.out.println(Arrays.toString(anagramMap.anagramMappings(A,B)));*/

/*      BikeRacks bikeRacks = new BikeRacks();
      int racks[] =
//              {5,5};
              {10,0,8,2,-1,12,11,3};
      System.out.println(bikeRacks.solution(racks));*/

       /* VacationDays vacationDays = new VacationDays();
        int vacation[] =
//                {2, 1, 1, 3, 2, 1, 1, 3};
//                {7,3,7,3,1,3,4,1};
                {7,5,2,7,2,7,4,7};
        System.out.println(vacationDays.solution(vacation));*/

       /*PascalsTriangle pascalsTriangle = new PascalsTriangle();
       System.out.println(pascalsTriangle.generate(6).toString());*/

       /*ToeplitzMatrix toeplitzMatrix = new ToeplitzMatrix();
       int array[][] = {{1,2,3,4},{5,1,2,3},{9,5,1,3}};
       System.out.println(toeplitzMatrix.isToeplitzMatrix(array));*/

       /*PlusOne plusOne = new PlusOne();
       int nums[] = {9,9,9,9};
       System.out.println(Arrays.toString(plusOne.plusOne(nums)));*/

        /*TwoSum twoSum = new TwoSum();
        int nums[] = {3,2,4},target = 6;
        System.out.println(Arrays.toString(twoSum.twoSum(nums,target)));*/

        /*FactTrailingZero factTrailingZero = new FactTrailingZero();
        System.out.println(factTrailingZero.trailingZeroes(1808548329));*/

        /*SquareRoot squareRoot = new SquareRoot();
        System.out.println(squareRoot.mySqrt(6));*/

        /*CountSay countSay = new CountSay();
        System.out.println(countSay.countAndSay(5));*/

        /*RemoveDublicates removeDublicates = new RemoveDublicates();
        int nums[] = {1,1,1,2,2};
        System.out.println(removeDublicates.removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));*/

        /*ValidParantheses validParantheses = new ValidParantheses();
        String str = "]";
//                "{hi{[hello]}(varun)}";
        System.out.println(validParantheses.isValid(str));*/

        /*MergeSortedArray mergeSortedArray = new MergeSortedArray();
        int nums1[] = {1,2,2,6,8,11,0,0,0,0,0,0,0},nums2[] = {3,3,4,6,7,10,11};
        mergeSortedArray.merge(nums1,6,nums2,7);
        System.out.println(Arrays.toString(nums1));*/

        /*LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String strs[] = {"a","aa"};
        System.out.println(longestCommonPrefix.longestCommonPrefix(strs));*/
        /*ReverseBits reverseBits = new ReverseBits();
        System.out.println(reverseBits.reverseBits(1 ));*/

        /*KeyboardKeys keyboardKeys = new KeyboardKeys();
        String[] words = {"Hello", "Alaska", "Dad", "Peace"};
        System.out.println(Arrays.toString(keyboardKeys.findWords(words)));*/

      /*  NeedleInHaystack needleInHaystack = new NeedleInHaystack();
        String haystack =haystack = "mississippi", needle = "issip";
//                "hello", needle = "ll";
        System.out.println(needleInHaystack.strStr(haystack,needle));*/

     /* DnaDistance dnaDistance = new DnaDistance();
      String[] bank = {"AAAAAAAA","AAAAAAAT","AAAAAATT","AAAAATTT"};
      String start = "AAAAAAAA", end = "AAAAAATT";
      System.out.println(dnaDistance.minMutation(start,end,bank));*/

     /*JewelsAndStones jewelsAndStones = new JewelsAndStones();
     String S = "aAAbbbb",J = "aA";
     System.out.println(jewelsAndStones.numJewelsInStones(J,S));*/

     /*ProductExceptSelf productExceptSelf = new ProductExceptSelf();
     int nums[] = {0,0};
     System.out.println(Arrays.toString(productExceptSelf.productExceptSelf(nums)));*/

     /*DeleteAndEarn deleteAndEarn = new DeleteAndEarn();
     int nums[] = {2, 2, 3, 3, 3, 4};
//             {3, 4, 2};
     System.out.println(deleteAndEarn.deleteAndEarn(nums));*/

    /* BaseballGame baseballGame = new BaseballGame();
     String plays[] = {"5","-2","4","C","D","9","+","+"};
//             {"5","2","C","D","+"};
     System.out.println(baseballGame.calPoints(plays));*/

    /*CountPrimes countPrimes = new CountPrimes();
    System.out.println(countPrimes.countPrimes(10));*/
 /*   DistributeCandies distributeCandies = new DistributeCandies();
    int candies[] = {1,1,2,3};
//            {1,1,2,2,3,3};
    System.out.println(distributeCandies.distributeCandies(candies));*/
        /*MatrixReshape matrixReshape = new MatrixReshape();
        int matrix[][] = {{1,2},{3,4}};
        System.out.println(Arrays.deepToString(matrixReshape.matrixReshape(matrix,1,6)));*/

        /*IslandParameter islandParameter = new IslandParameter();
        int array[][] = {{0,1,0,0}, {1,1,1,0}, {0,1,0,0}, {1,1,0,0}};
        System.out.println(islandParameter.islandPerimeter(array));*/

//        NextGreaterNum nextGreaterNum = new NextGreaterNum();
//        int[] nums1 = {2,4}, nums2 = {1,2,3,4};
//        System.out.println(Arrays.toString(nextGreaterNum.nextGreaterElement(nums1,nums2)));

//        UglyNumber uglyNumber = new UglyNumber();
//        System.out.println(uglyNumber.isUgly(14));

        /*CountBitPrime countBitPrime = new CountBitPrime();
        System.out.println(countBitPrime.countPrimeSetBits(10,15));*/

        /*AlternatingBits alternatingBits = new AlternatingBits();
        System.out.println(alternatingBits.hasAlternatingBits(2));*/

        /*TestByReference testByReference = new TestByReference();
        testByReference.printSwapped(5,10);*/

        /*CouldBePalindrome couldBePalindrome = new CouldBePalindrome();
        String s = "ajkdfnkjsldgbrgbdsfogin";
        System.out.println(couldBePalindrome.checkPalindrome(s));*/

        /*MaxConsecutiveOne maxConsecutiveOne = new MaxConsecutiveOne();
        int nums[] = {1,1,0,1,1,1};
        System.out.println(maxConsecutiveOne.findMaxConsecutiveOnes(nums));*/

        /*MyAlerter myAlerter = new MyAlerter();
        int nums[] = {200,2,200,2,2,200}, size = 3;
        double threshold = 2.5;
        System.out.println(myAlerter.alertMe(nums,size,threshold));*/

        /*DetectCapital detectCapital = new DetectCapital();
        String word = "Capital";
        System.out.println(detectCapital.detectCapitalUse(word));*/

        /*MostFrequent mostFrequent = new MostFrequent();
        int nums[] = {1,2};
//                {1,1,1,2,2,3}
        int k = 2;
        System.out.println(mostFrequent.topKFrequent(nums,k));*/

        /*SumOf4 sumOf4 = new SumOf4();
        int [] A = {1,2}, B = {-2,-1}, C = {-1,2}, D = {0,2};
        System.out.println(sumOf4.fourSumCount(A,B,C,D));*/

        /*FindTheDifference findTheDifference = new FindTheDifference();
        String t = "abcde", s = "abcd";
        System.out.println(findTheDifference.findTheDifference(s,t));*/

        /*MissingNumbers missingNumbers = new MissingNumbers();
        int nums[] = {4,3,2,7,8,2,3,1};
        System.out.println(missingNumbers.findDisappearedNumbers(nums));*/

        /*RotatingNumbers rotatingNumbers = new RotatingNumbers();
        System.out.println(rotatingNumbers.rotatedDigits(10));*/

        /*SortingStringWithNumbers sortingStringWithNumbers = new SortingStringWithNumbers();
        String str[] = {
                "USA" + Integer.toString(10),
                "CESKO" + Integer.toString(2),
                "KANADA" + Integer.toString(32),
                "SLOVENSKO" + Integer.toString(11),
                "SPANELSKO" + Integer.toString(22),
                "NIZOZEMI" + Integer.toString(3),
                "NEMECKO" + Integer.toString(31),
        };
        System.out.println(Arrays.deepToString(sortingStringWithNumbers.sortByNumbers(str)));*/

        /*RangeAddition rangeAddition = new RangeAddition();
        int ops[][] = {{2,2},{3,3}};
        System.out.println(rangeAddition.maxCount(3,3,ops));*/

        /*RectanglarArea rectanglarArea = new RectanglarArea();
        int area = 1;
        while(area<=50){
            System.out.println(area+" "+Arrays.toString(rectanglarArea.constructRectangle(area)));
            area++;
        }*/

        /*CheckNull checkNull = new CheckNull();
        String str = null;
        System.out.println(checkNull.checkNull(str));*/

        /*MinimumMovesToEquate minimumMovesToEquate = new MinimumMovesToEquate();
        int nums[] = {1,2,3};
        System.out.println(minimumMovesToEquate.minMoves(nums));*/

        DegreeOfArray degreeOfArray = new DegreeOfArray();
        int nums[] = {1,2,1,3,3};
        System.out.println(degreeOfArray.findShortestSubArray(nums));

        /*SpiralMatrix spiralMatrix = new SpiralMatrix();
        int matrix[][] = {{1},{2},{3}};
                        *//*{{1, 2, 3, 10}
                        ,{4, 5, 6, 11}
                        ,{7, 8, 9, 12}};*//*
        System.out.println(spiralMatrix.spiralOrder(matrix));*/

        /*FindPattern findPattern = new FindPattern();
        String s = "abcdabcd";
        System.out.println(findPattern.findPatternIfExist(s));*/

    }
}
