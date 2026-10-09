package com.example.pertemuan_4

import androidx.compose.runtime.Composable

@Composable
fun ActivityPertama(modifier : Modifier){
    Column(
        modifier = Modifier. padding(top = 100.dp). fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            stringResource("Teknologi Informasi"),
            fontSize = 35.sp,
            fontWeight = FontWeight.Bold,
        )
        Text(
            stringResource("Universitas Muhammadiyah Yogyakarta"),
            fontSize = 22.sp
        )
    }
}