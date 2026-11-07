package L1;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.media.session.p;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class b extends View {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f5434r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d f5435s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, Context context, ViewGroup viewGroup) {
        super(context);
        this.f5435s = dVar;
        this.f5434r = viewGroup;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        d dVar = this.f5435s;
        ArrayList arrayList = dVar.f5440b;
        Drawable background = this.f5434r.getBackground();
        int color = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        if (dVar.f5443e != color) {
            dVar.f5443e = color;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ArrayList arrayList2 = ((a) arrayList.get(size)).f5430a;
                int size2 = arrayList2.size() - 1;
                if (size2 >= 0) {
                    throw p.u(size2, arrayList2);
                }
            }
        }
    }
}
