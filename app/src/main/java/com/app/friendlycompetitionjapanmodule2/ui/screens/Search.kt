package com.app.friendlycompetitionjapanmodule2.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
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
import androidx.compose.ui.draw.clip
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
fun Search() {
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
          Image(
            painter = painterResource(R.drawable.search),
            contentDescription = null,
            modifier = Modifier
              .width(20.dp)
          )
        }
      )
    }

    HorizontalDivider(
      modifier = Modifier
        .fillMaxWidth()
        .padding(12.dp)
    )
    Text(
      text = "hot",
      style = MaterialTheme.typography.bodyLarge.copy(
        fontSize = 24.sp,
        lineHeight = 28.sp,
        fontWeight = FontWeight.Bold
      ),
      textAlign = TextAlign.Center
    )


    val pager = rememberPagerState(
      pageCount = { 2 }
    )

    HorizontalPager(
      state = pager
    ) {
      Column(
        modifier = Modifier.padding(24.dp),
        verticalArrangement = Arrangement.spacedBy(24.dp)
      ) {
        Row(
          modifier = Modifier.fillMaxWidth(),
          verticalAlignment = Alignment.CenterVertically,
          horizontalArrangement = Arrangement.spacedBy(24.dp, Alignment.CenterHorizontally)
        ) {
          Column(
            modifier = Modifier.weight(1f)
          ) {
            NewsCard()
          }
          Column(
            modifier = Modifier.weight(1f)
          ) {
            NewsCard()
          }
        }


        Row(
          modifier = Modifier.fillMaxWidth(),
          verticalAlignment = Alignment.CenterVertically,
          horizontalArrangement = Arrangement.spacedBy(24.dp, Alignment.CenterHorizontally)
        ) {
          Column(
            modifier = Modifier.weight(1f)
          ) {
            NewsCard()
          }
          Column(
            modifier = Modifier.weight(1f)
          ) {
            NewsCard()
          }
        }
      }
    }

    Row(
      modifier = Modifier.fillMaxWidth(),
      verticalAlignment = Alignment.CenterVertically,
      horizontalArrangement = Arrangement.spacedBy(4.dp, Alignment.CenterHorizontally)
    ) {
      repeat(pager.pageCount) {
        Box(
          modifier = Modifier
            .size(15.dp)
            .clip(CircleShape)
            .background(if (it == pager.currentPage) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.surfaceVariant)
        )
      }
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
      IconButton(
        onClick = {
          onBack()
        }
      ) {
        Icon(Icons.Default.Close, null)
      }

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
private fun Preview_Search() {
  FriendlyCompetitionJapanModule2Theme() {
    Search()
  }
}
