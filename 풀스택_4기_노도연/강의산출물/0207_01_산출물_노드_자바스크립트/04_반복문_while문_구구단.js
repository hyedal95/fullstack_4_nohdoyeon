//구구단
let i=1; // 2~9
let j=1; //1~9
while(i<9){
    i++; //2 3 4 5 6 7 8 9
    j=0; //j값 초기화
    console.log(`${i}단`);
    while(j<9){
        j++;  //1 2 3 4 5 6 7 8 9
        console.log( `${i} × ${j} = ${i*j}`);

    }
    console.log();
}

//결과
// 2단
// 2 × 1 = 2 
// 2 × 2 = 4 
// 2 × 3 = 6 
// 2 × 4 = 8 
// 2 × 5 = 10
// 2 × 6 = 12
// 2 × 7 = 14
// 2 × 8 = 16
// 2 × 9 = 18
// 3단       
// 3 × 1 = 3
// 3 × 2 = 6
// 3 × 3 = 9
// 3 × 4 = 12
// 3 × 5 = 15
// 3 × 6 = 18
// 3 × 7 = 21
// 3 × 8 = 24
// 3 × 9 = 27
// 4단
// 4 × 1 = 4
// 4 × 2 = 8
// 4 × 3 = 12
// 4 × 4 = 16
// 4 × 5 = 20
// 4 × 6 = 24
// 4 × 7 = 28
// 4 × 8 = 32
// 4 × 9 = 36
// 5단
// 5 × 1 = 5
// 5 × 2 = 10
// 5 × 3 = 15
// 5 × 4 = 20
// 5 × 5 = 25
// 5 × 6 = 30
// 5 × 7 = 35
// 5 × 8 = 40
// 5 × 9 = 45
// 6단
// 6 × 1 = 6
// 6 × 2 = 12
// 6 × 3 = 18
// 6 × 4 = 24
// 6 × 5 = 30
// 6 × 6 = 36
// 6 × 7 = 42
// 6 × 8 = 48
// 6 × 9 = 54
// 7단
// 7 × 1 = 7
// 7 × 2 = 14
// 7 × 3 = 21
// 7 × 4 = 28
// 7 × 5 = 35
// 7 × 6 = 42
// 7 × 7 = 49
// 7 × 8 = 56
// 7 × 9 = 63
// 8단
// 8 × 1 = 8
// 8 × 2 = 16
// 8 × 3 = 24
// 8 × 4 = 32
// 8 × 5 = 40
// 8 × 6 = 48
// 8 × 7 = 56
// 8 × 8 = 64
// 9단
// 9 × 1 = 9
// 9 × 2 = 18
// 9 × 3 = 27
// 9 × 4 = 36
// 9 × 5 = 45
// 9 × 6 = 54
// 9 × 7 = 63
// 9 × 8 = 72
// 9 × 9 = 81

// --구구단 가로출력 while문으로 구현하시오.
// 출력예시
// 2×1= 2  3×1= 3  4×1= 4  5×1= 5  6×1= 6  7×1= 7  8×1= 8  9×1= 9
// 2×2= 4  3×2= 6  4×2= 8  5×2=10  6×2=12  7×2=14  8×2=16  9×2=18
// 2×3= 6  3×3= 9  4×3=12  5×3=15  6×3=18  7×3=21  8×3=24  9×3=27
// 2×4= 8  3×4=12  4×4=16  5×4=20  6×4=24  7×4=28  8×4=32  9×4=36
// 2×5=10  3×5=15  4×5=20  5×5=25  6×5=30  7×5=35  8×5=40  9×5=45
// 2×6=12  3×6=18  4×6=24  5×6=30  6×6=36  7×6=42  8×6=48  9×6=54
// 2×7=14  3×7=21  4×7=28  5×7=35  6×7=42  7×7=49  8×7=56  9×7=63
// 2×8=16  3×8=24  4×8=32  5×8=40  6×8=48  7×8=56  8×8=64  9×8=72
// 2×9=18  3×9=27  4×9=36  5×9=45  6×9=54  7×9=63  8×9=72  9×9=81
console.log('--구구단 가로출력 while문--')
i=0;
j=1;
while(i<9){ 
    i++;
    j=1;  //초기화
    while(j<9){
        j++;
        process.stdout.write( `${j}×${i}=${String(j*i).padStart(2,' ')}  ` );

    }
    process.stdout.write('\n');
}

// --구구단 가로출력 while문--
// 2×1= 2  3×1= 3  4×1= 4  5×1= 5  6×1= 6  7×1= 7  8×1= 8  9×1= 9
// 2×2= 4  3×2= 6  4×2= 8  5×2=10  6×2=12  7×2=14  8×2=16  9×2=18
// 2×3= 6  3×3= 9  4×3=12  5×3=15  6×3=18  7×3=21  8×3=24  9×3=27
// 2×4= 8  3×4=12  4×4=16  5×4=20  6×4=24  7×4=28  8×4=32  9×4=36
// 2×5=10  3×5=15  4×5=20  5×5=25  6×5=30  7×5=35  8×5=40  9×5=45
// 2×6=12  3×6=18  4×6=24  5×6=30  6×6=36  7×6=42  8×6=48  9×6=54
// 2×7=14  3×7=21  4×7=28  5×7=35  6×7=42  7×7=49  8×7=56  9×7=63
// 2×8=16  3×8=24  4×8=32  5×8=40  6×8=48  7×8=56  8×8=64  9×8=72
// 2×9=18  3×9=27  4×9=36  5×9=45  6×9=54  7×9=63  8×9=72  9×9=81