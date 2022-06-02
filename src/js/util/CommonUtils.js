
// 약수 구하기
function getDivisors(num) {
    const divisors = [];
    for(let i = 1 ; i <= Math.sqrt(num) ; i++){
        if(num % i === 0) {
            divisors.push(i);
            if(num / i != i) divisors.push(num / i);
        }
    }

    return divisors;
}

// 특정 단위로 문자열 자르기
function chunkSubstr(str, size) {
    return str.match(new RegExp(`.{1,${size}}`, 'g'));
}


// 특정 인덱스 문자열 변경하기
function replaceStr(index, character) {
    return character.substr(0, index) + character + character.substr(index+character.length);
}
