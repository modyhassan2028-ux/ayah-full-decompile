package M7;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class k extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f5785b;

    public /* synthetic */ k(l lVar, int i10) {
        this.f5784a = i10;
        this.f5785b = lVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f5784a) {
            case 1:
                super.onAnimationEnd(animator);
                l lVar = this.f5785b;
                super/*android.graphics.drawable.Drawable*/.setVisible(false, false);
                ArrayList arrayList = lVar.f5793w;
                if (arrayList != null && !lVar.f5794x) {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ((c) obj).a(lVar);
                    }
                    break;
                }
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f5784a) {
            case 0:
                super.onAnimationStart(animator);
                l lVar = this.f5785b;
                ArrayList arrayList = lVar.f5793w;
                if (arrayList != null && !lVar.f5794x) {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ((c) obj).b(lVar);
                    }
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
