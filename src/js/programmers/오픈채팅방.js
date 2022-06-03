/*
    생각의 흐름
        1. 포인트는 특정 아이디에 해당하는 최종 이름을 관리해야함
            => Change나 Enter 일때마다 바뀔 '수'도 있으니 첨부터 다 훑어야함
        2. 특정 액션은 뿌려줄 필요 없음
            => 새로운 배열을 만들 때 제외
        3. 1번 사항을 처리할 때 필요한 변수를 모두 세팅 후 마지막에는 값에 맞춰서 뿌려주기만 하면 됨
*/


function solution(record) {

    // Map 대신 사용하는 것을 고려해볼것
    const idName = {};
    const newRecord = [];

    record.forEach(rec => {
        const [action, id, name] = rec.split(" ");
        if (action === 'Enter') {
            idName[id] = name;
            newRecord.push([id, '님이 들어왔습니다.']);
        }
        else if (action === 'Change') {
            idName[id] = name;
        }
        else {
            newRecord.push([id, '님이 나갔습니다.']);
        }
    });


    return newRecord.map(newRec => {
        const [id, action] = newRec;

        return idName[id] + action;
    });
}


/*
1. Map 대신 {} 사용하는것도 고려해 볼 것
    {}[] = something;
2. 문자열은 하드코딩이 빠름
3. split 의
4. Array의 for in 은 불가함..
 */
