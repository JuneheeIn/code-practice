/*
    생각의 흐름
        1. 처음에는 문제를 제대로 이해하지 못하여 접근방식을 잘못함
            1-1. 앞에서부터 정해진 길이만큼 자룰 수 있는것을, 앞이나 뒤나 똑같은 길이만큼 자를 수 있는것으로
                생각해서 주어지는 문자열 길이의 약수를 구하여 처리하게 됨
            1-2. 걍 무지성으로 앞에서부터 1개씩 잘라보고 값을 관리한 다음 짧은거 주면 됨..
        2.
*/


function solution(s) {
    let answer = s.length;
    const strLength = s.length;

    // 1개 단위부터 자르는거 시작
    for (let i = 1; i <= strLength / 2; i++) {
        let str = "";
        let repeatCount = 1;
        let tempStr = s.substr(0, i);

        // 몇 번째부터 몇개 단위로 자르는거 시작
        for (let index = i; index <= strLength; index += i) {
            let nextStr = s.substr(index, i);

            if (tempStr === nextStr) {
                repeatCount += 1;
            } else {
                if (repeatCount === 1) str += tempStr;
                else str += repeatCount + tempStr;

                repeatCount = 1;
                tempStr = nextStr;
            }
        }

        if (repeatCount === 1) str += tempStr;
        else str += repeatCount + tempStr;
        answer = Math.min(answer, str.length);
    }

    return answer;
}


/*
1. substr 용법 정리
2. Math 숙지
 */
