package Q8;

import android.app.AlarmManager;
import android.content.Context;
import com.ayah.R;
import com.ayah.common.ui.view.QuranImageFooter;
import com.ayah.feature.khatmah.ui.wrapper.KhatmahWrapper;
import com.google.android.gms.internal.measurement.AbstractC0813f2;

/* JADX INFO: renamed from: Q8.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0469p implements p241y9.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f7045r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Context f7046s;

    public /* synthetic */ C0469p(Context context, int i10) {
        this.f7045r = i10;
        this.f7046s = context;
    }

    @Override // p241y9.a
    public final Object invoke() {
        int i10 = this.f7045r;
        Context context = this.f7046s;
        switch (i10) {
            case 0:
                return AbstractC0813f2.t(context, "aqs/sessionConfigsDataStore.data");
            case 1:
                return AbstractC0813f2.t(context, "aqs/sessionDataStore.data");
            case 2:
                int i11 = KhatmahWrapper.f13794v;
                Object systemService = context.getApplicationContext().getSystemService("alarm");
                p251z9.j.c(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
                return (AlarmManager) systemService;
            case 3:
                boolean z10 = QuranImageFooter.f13710B;
                return Boolean.valueOf(context.getResources().getBoolean(R.bool.is_dark_mode));
            default:
                return p181s2.t.b(context);
        }
    }
}
