def reverseWords(s):
    """
    :type s: str
    :rtype: str
    """
    sl = s.strip().split();
    i = 0; j = len(sl) - 1
    while i<j:
        sl[i], sl[j] = sl[j], sl[i]
        i+=1;j-=1;
    return ' '.join(sl)
def main():
    s = input()
    print(reverseWords(s))
main()