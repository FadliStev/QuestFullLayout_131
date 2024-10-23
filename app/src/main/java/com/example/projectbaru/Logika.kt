package com.example.projectbaru

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.AlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview (showBackground = true)
@Composable
fun Logika(modifier: Modifier = Modifier){
    Column (modifier = Modifier.fillMaxSize()) {
        SectionHeader()
        Spacer(modifier = Modifier.padding(20.dp))
        Text(
            text = "Kepada YTH"
        )
        Text(text = "Pak Tua Sirohige")
        Spacer(modifier = Modifier.padding(20.dp))

        MainSection(
            judulParam = "Nama",
            isiParam = "Aceng"
        )
        MainSection(
            judulParam = "Kelas",
            isiParam = "Kelas Apalah Terserah"
        )
        MainSection(
            judulParam = "NIM",
            isiParam = "20210140131"
        )
        MainSection(
            judulParam = "Alamat",
            isiParam = "Alamak Mana Rumahku"
        )
    }
}

@Composable
fun SectionHeader(){
    Box(modifier = Modifier
        .fillMaxWidth()
        .background(Color.DarkGray)){
    Row (
        modifier = Modifier.padding(15.dp)
            ){
       Box(contentAlignment = Alignment.BottomEnd){
           Image(
               painter = painterResource(id = R.drawable.kumisputih),
               contentDescription = "",
               Modifier
                   .size(110.dp)
                   .clip(shape = CircleShape)
               )
           Icon(
               Icons.Filled.Check,
               contentDescription = "",
               Modifier
                   .padding(end = 15.dp)
                   .size(30.dp),
               tint = Color.Red

           )
       }
        Column (Modifier.padding(15.dp)) {
            Text(
                text = "Teknologi Informasi",
                color = Color.White
            )
            Text(
                text = "Universitas Bajak Laut Jenggot Putih",
                color = Color.White
                )
        }
    }
    }
}

@Composable
fun MainSection(
    judulParam: String,
    isiParam: String

){
    Column(
        horizontalAlignment = Alignment.Start,
        modifier = Modifier.padding(3.dp)
        ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(3.dp),
            horizontalArrangement = Arrangement.SpaceBetween

        ) {
            Text(
                text = judulParam,
                modifier = Modifier.weight(0.8f)
            )
            Text(
                text = " : ",
                modifier = Modifier.weight(0.2f)
            )
            Text(
                text = "$isiParam",
                modifier = Modifier.weight(2f)
            )
        }
    }
    
}