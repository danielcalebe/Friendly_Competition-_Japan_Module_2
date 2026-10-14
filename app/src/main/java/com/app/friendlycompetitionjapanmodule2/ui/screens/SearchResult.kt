package com.app.friendlycompetitionjapanmodule2.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.app.friendlycompetitionjapanmodule2.R
import com.app.friendlycompetitionjapanmodule2.ui.theme.FriendlyCompetitionJapanModule2Theme

@Composable
fun SearchResult() {
  var query by remember { mutableStateOf("") }
  Column(
    modifier = Modifier
      .fillMaxSize()
      .background(MaterialTheme.colorScheme.background),
    horizontalAlignment = Alignment.CenterHorizontally
  ) {
    SearchPageHeader(onBack = {})


    Row(
      modifier = Modifier
        .fillMaxWidth()
        .padding(12.dp)
    ) {
      OutlinedTextField(
        value = query,
        onValueChange = { query = it },
        modifier = Modifier.fillMaxWidth(),
        trailingIcon = {
          Row(
            modifier = Modifier.padding(horizontal = 16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp)
          ) {

            IconButton(
              onClick = {

              }
            ) {
              Icon(Icons.Default.Close, null)
            }
            Image(
              painter = painterResource(R.drawable.search),
              contentDescription = null,
              modifier = Modifier
                .width(20.dp)
            )

          }
        })
    }

    HorizontalDivider(
      modifier = Modifier
        .fillMaxWidth()
        .padding(12.dp)
    )

    Row(
      modifier = Modifier
        .fillMaxWidth()
        .padding(horizontal = 12.dp),
      verticalAlignment = Alignment.CenterVertically,
      horizontalArrangement = Arrangement.End
    ) {
      Row(
        modifier = Modifier
          .border(2.dp, color = MaterialTheme.colorScheme.onBackground)
          .padding(8.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp)
      ) {
        Text("Time↓")
        Icon(Icons.Default.KeyboardArrowDown, null)
      }
    }



    LazyColumn(
      modifier = Modifier
        .fillMaxWidth()
        .padding(12.dp),
      verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
      items(5) {
        SearchResultItem()
      }
    }

  }
}

@Composable
private fun SearchResultItem() {
  Row(
    modifier = Modifier.fillMaxWidth(),
    verticalAlignment = Alignment.CenterVertically,
    horizontalArrangement = Arrangement.spacedBy(8.dp)
  ) {
    Image(
      painter = painterResource(R.drawable.new_5_image_1),
      null,
      modifier = Modifier
        .width(160.dp)
        .aspectRatio(16f / 9f)
    )

    Column(
      modifier = Modifier.fillMaxWidth()
    ) {
      Text(
        "Strong cold air coming tonight! Guangdong lowest break 0! As for the weather in Guangzhou ",
        fontSize = 14.sp,
        lineHeight = 14.sp,
        fontWeight = FontWeight.Bold
      )
      Text("Feb 20, 2024", style = MaterialTheme.typography.labelLarge)
      Text("Evidence from a 2,000-foot-long ice core reveals that the West Antarctic Ice Sheet shrank suddenly and dramatically around 8,000 years ago, according to new research —", fontSize = 14.sp, lineHeight = 14.sp)
    }

  }
}

@Composable
private fun SearchPageHeader(onBack: () -> Unit) {
  Column(

  ) {
    Row(
      modifier = Modifier
        .fillMaxWidth()
        .padding(horizontal = 16.dp),
      verticalAlignment = Alignment.CenterVertically,
      horizontalArrangement = Arrangement.SpaceBetween
    ) {
      Image(
        painter = painterResource(R.drawable.search),
        contentDescription = null,
        modifier = Modifier
          .width(20.dp)
          .clickable(onClick = { }),
      )


      Image(
        painter = painterResource(R.drawable.logo),
        contentDescription = null,
        modifier = Modifier.size(60.dp),
        contentScale = ContentScale.Crop
      )

      Box(modifier = Modifier.width(48.dp))

    }
    HorizontalDivider(modifier = Modifier.fillMaxWidth())
  }
}


@Preview
@Composable
private fun Preview_SearchResult() {
  FriendlyCompetitionJapanModule2Theme() {
    SearchResult()
  }
}
