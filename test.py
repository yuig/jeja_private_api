
import hashlib

    
def generate_signature(str):
    key_pairs = str.split('&')
    key_pairs = sorted(key_pairs)
    strx = ""
    print(key_pairs)
    for b in key_pairs:
        strx += b 
        if(not "="in b):
            strx += "="
        strx += '&'
    strx = strx[:-1]+"zcfxAcXh1U0sUkrtLKLcRcrXSoScL4"
    print(strx)
    bits = bytes(strx, 'utf-8')
    c = hashlib.md5(bits).digest()
    string_buffer =""
    for bit in c:
        string_buffer += format((bit&255)+256,'x')[1:]
    return string_buffer


print(generate_signature("device=sm-g935f&token&offset=0&search_query&logged=false&id_user&sort=new"))