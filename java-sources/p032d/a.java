package p032d;

import android.R;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.K;
import p074h0.d;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ViewGroup.LayoutParams f15519a = new ViewGroup.LayoutParams(-2, -2);

    public static void a(AppCompatActivity appCompatActivity, d dVar) {
        int i10 = 0;
        View childAt = ((ViewGroup) appCompatActivity.getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        AttributeSet attributeSet = null;
        ComposeView composeView = childAt instanceof ComposeView ? (ComposeView) childAt : null;
        if (composeView != null) {
            composeView.setParentCompositionContext(null);
            composeView.setContent(dVar);
            return;
        }
        ComposeView composeView2 = new ComposeView(appCompatActivity, attributeSet, 6, i10);
        composeView2.setParentCompositionContext(null);
        composeView2.setContent(dVar);
        View decorView = appCompatActivity.getWindow().getDecorView();
        if (K.d(decorView) == null) {
            K.g(decorView, appCompatActivity);
        }
        if (K.e(decorView) == null) {
            K.h(decorView, appCompatActivity);
        }
        if (p000a.a.H(decorView) == null) {
            p000a.a.j0(decorView, appCompatActivity);
        }
        appCompatActivity.setContentView(composeView2, f15519a);
    }
}
