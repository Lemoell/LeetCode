/*

==========================================================================
Dado um inteiro x, retorne truese xfor umpalíndromo, e falsede outra forma
==========================================================================
 
*/

class Solution {
    public boolean isPalindrome(int x) {
        String SuporteParaTamanho = Integer.toString (x);
        int i = 0, j = SuporteParaTamanho.length() - 1;

        while (i < j){
            if (SuporteParaTamanho.charAt(i) != SuporteParaTamanho.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}