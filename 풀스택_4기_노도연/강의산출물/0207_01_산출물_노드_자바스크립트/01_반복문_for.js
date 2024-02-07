// 1.1 ~ 10까지 1씩 증가하는 반복문
// 실행은 node.js를 사용
console.log()
for(let i=1; i<=10; i++){
    console.log(i);
}
console.log()
//결과
// 1
// 2
// 3
// 4
// 5
// 6
// 7
// 8
// 9
// 10

// 2.10 ~1까지 1씩 감소하는 반복문
console.log(`\n`);
for(let i=10; i>0; i--){
    // console.log('\n' + i + '\n');
    // console.log(`\n${i}\n`);
    console.log(i);
}
console.log(`\n`);

//결과
// 10
// 9
// 8
// 7
// 6
// 5
// 4
// 3
// 2
// 1


// 3.1 ~50까지 3씩 증가하는 for반복문
console.log(`\n`);
for(let i=1; i<=50; i+=3){
    console.log(i)
}
console.log(`\n`);

//결과
// 1
// 4
// 7
// 10
// 13
// 16
// 19
// 22
// 25
// 28
// 31
// 34
// 37
// 40
// 43
// 46
// 49
// 4.50 ~1까지 3씩 감소하는 for반복문
console.log(`\n`);
for(let i=50; i>0; i-=3){
    console.log(i)
}
console.log(`\n`);
// 결과
// 50
// 47
// 44
// 41
// 38
// 35
// 32
// 29
// 26
// 23
// 20
// 17
// 14
// 11
// 8
// 5
// 2