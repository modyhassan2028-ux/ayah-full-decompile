package X7;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: loaded from: classes.dex */
public final class o extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextView f10051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f10052c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TextView f10053d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q f10054e;

    public o(q qVar, int i10, TextView textView, int i11, TextView textView2) {
        this.f10054e = qVar;
        this.f10050a = i10;
        this.f10051b = textView;
        this.f10052c = i11;
        this.f10053d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        AppCompatTextView appCompatTextView;
        int i10 = this.f10050a;
        q qVar = this.f10054e;
        qVar.f10069n = i10;
        qVar.f10067l = null;
        TextView textView = this.f10051b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f10052c == 1 && (appCompatTextView = qVar.f10073r) != null) {
                appCompatTextView.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.f10053d;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.f10053d;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(0.0f);
        }
    }
}
