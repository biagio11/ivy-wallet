package com.ivy.wallet.ui.theme.wallet

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.ivy.design.l0_system.UI
import com.ivy.design.l0_system.style
import com.ivy.legacy.utils.format
import com.ivy.legacy.utils.shortenAmount
import com.ivy.legacy.utils.shouldShortAmount

@SuppressLint("ComposeModifierMissing")
@Deprecated("Old design system. Use `:ivy-design` and Material3")
@Composable
fun AmountCurrencyB2Row(
    amount: Double,
    currency: String,
    amountFontWeight: FontWeight = FontWeight.ExtraBold,
    textColor: Color = UI.colors.pureInverse
) {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = amount.format(currency),
            style = UI.typo.nB2.style(
                fontWeight = amountFontWeight,
                color = textColor
            )
        )
        Spacer(modifier = Modifier.width(4.dp))
        Text(
            text = currency,
            style = UI.typo.nB2.style(
                fontWeight = FontWeight.Normal,
                color = textColor
            )
        )
    }
}

@SuppressLint("ComposeModifierMissing")
@Composable
fun AmountCurrencyB1Row(
    amount: Double,
    currency: String,
    amountFontWeight: FontWeight = FontWeight.Bold,
    textColor: Color = UI.colors.pureInverse
) {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        AmountCurrencyB1(
            amount = amount,
            currency = currency,
            amountFontWeight = amountFontWeight,
            textColor = textColor
        )
    }
}

@SuppressLint(
    "ComposeContentEmitterReturningValues",
    "ComposeMultipleContentEmitters",
    "ComposeModifierMissing"
)
@Composable
fun AmountCurrencyB1(
    amount: Double,
    currency: String,
    amountFontWeight: FontWeight = FontWeight.Bold,
    textColor: Color = UI.colors.pureInverse,
    shortenBigNumbers: Boolean = false
) {
    val shortAmount = shortenBigNumbers && shouldShortAmount(amount)
    val text = if (shortAmount) shortenAmount(amount) else amount.format(currency)
    Text(
        modifier = Modifier.testTag("amount_currency_b1"),
        text = text,
        style = UI.typo.nB1.style(
            fontWeight = amountFontWeight,
            color = textColor
        )
    )
    Spacer(modifier = Modifier.width(4.dp))
    Text(
        text = currency,
        style = UI.typo.nB1.style(
            fontWeight = FontWeight.Normal,
            color = textColor
        )
    )
}

@SuppressLint(
    "ComposeContentEmitterReturningValues",
    "ComposeMultipleContentEmitters",
    "ComposeModifierMissing"
)
@Composable
fun AmountCurrencyH1(
    amount: Double,
    currency: String,
    @SuppressLint("ComposeContentEmitterReturningValues") textColor: Color = UI.colors.pureInverse
) {
    Text(
        text = amount.format(currency),
        style = UI.typo.nH1.style(
            fontWeight = FontWeight.Bold,
            color = textColor
        )
    )
    Spacer(modifier = Modifier.width(4.dp))
    Text(
        text = currency,
        style = UI.typo.nH2.style(
            fontWeight = FontWeight.Normal,
            color = textColor
        )
    )
}

@SuppressLint("ComposeModifierMissing")
@Composable
fun AmountCurrencyH2Row(
    amount: Double,
    currency: String,
    textColor: Color = UI.colors.pureInverse
) {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = amount.format(currency),
            style = UI.typo.nH2.style(
                fontWeight = FontWeight.Bold,
                color = textColor
            )
        )
        Spacer(modifier = Modifier.width(4.dp))
        Text(
            text = currency,
            style = UI.typo.b1.style(
                fontWeight = FontWeight.Normal,
                color = textColor
            )
        )
    }
}

@SuppressLint(
    "ComposeContentEmitterReturningValues",
    "ComposeMultipleContentEmitters",
    "ComposeModifierMissing"
)
@Composable
fun AmountCurrencyCaption(
    amount: Double,
    currency: String,
    amountFontWeight: FontWeight = FontWeight.ExtraBold,
    textColor: Color = UI.colors.pureInverse
) {
    Text(
        text = amount.format(currency),
        style = UI.typo.nC.style(
            fontWeight = amountFontWeight,
            color = textColor
        )
    )
    Spacer(modifier = Modifier.width(4.dp))
    Text(
        text = currency,
        style = UI.typo.nC.style(
            fontWeight = FontWeight.Normal,
            color = textColor
        )
    )
}
