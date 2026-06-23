class Solution:
    def lemonadeChange(self, bills: List[int]) -> bool:
        fiver = 0
        tenner = 0

        for bill in bills:
            if bill == 5:
                fiver += 1
            else:
                if bill == 10 and fiver:
                    fiver -= 1
                    tenner += 1
                elif bill == 20 and fiver:
                    if tenner:
                        tenner -= 1
                        fiver -= 1
                    elif fiver >= 3:
                        fiver -= 3
                    else:
                        return False
                else:
                    return False
        
        return True