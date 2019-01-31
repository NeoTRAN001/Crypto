def banner()
    print '
     _______  _______  _______  _______ 
    |   _   ||   _   ||   _   ||   _   |
    |  |_|  ||  |_|  ||  |_|  ||  |_|  |
    |       ||       ||       ||       |
    |       ||       ||       ||       |
    |   _   ||   _   ||   _   ||   _   |
    |__| |__||__| |__||__| |__||__| |__|    
                                         
    [c] cipher   [d] decipher   [e] exit                                                             
    '
    print "--> "
    op = gets.chomp
    return op
end

def read_text()
    print "Write a text: "
    text = gets.chomp
    text_custom = text.gsub(' ', '[')
    return text_custom.upcase
end

def read_key()
    print "Write a key: "
    text = gets.chomp
    return text.split(//)
end

def aaaa(text)
    key = ""
    a = ""
    text.each_byte do |c|
        n = c.to_i - 65
        if (n < 10) then key += "0#{n}"
        else key += "#{n}"
        end
    end

    for i in (1..text.length)
        a += "A"
    end
    puts "\n Your text: #{a}"
    puts "\n Your key: #{key}"
end

def decipher(key, text)
    i = 0
    result = ""

    for j in (0..text.length-1)
        n = ("#{key[i]}#{key[1+i]}").to_i
        result += "#{(n+65).chr}"
        i += 2
    end

    puts result.gsub('[', ' ')
end

def init_cipher()
    loop do
        op = banner
        break if (op == "e" || op == "E")

        if (op == "c" || op == "C")
            aaaa(read_text)
        elsif (op == "d" || op == "D")

            decipher(read_key, read_text)
        end
    end
end

init_cipher