package Ca;

import K9.AbstractC0405x;
import K9.InterfaceC0402u;
import X.C0629a;
import Z.C0675c0;
import Z.L0;
import Z.X;
import android.content.Context;
import android.text.SpannableStringBuilder;
import com.ayah.common.ui.view.QuranAyahTextView;
import com.ayah.feature.khatmah.ui.wrapper.KhatmahWrapper;
import com.ayah.feature.reminder.ReminderSettingsActivity;
import j$.time.LocalTime;
import p110k9.y;
import p180s0.G;
import p180s0.M;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f813r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f814s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f815t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f816u;

    public /* synthetic */ h(Object obj, Object obj2, Object obj3, int i10) {
        this.f813r = i10;
        this.f814s = obj;
        this.f815t = obj2;
        this.f816u = obj3;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        int i10 = this.f813r;
        int i11 = 0;
        int i12 = 2;
        y yVar = y.f19095a;
        Object obj2 = this.f816u;
        Object obj3 = this.f815t;
        Object obj4 = this.f814s;
        switch (i10) {
            case 0:
                p251z9.j.e((Da.i) obj, "it");
                ((j) obj4).f820d.k((r) obj3, obj2);
                return yVar;
            case 1:
                C0675c0 c0675c0 = (C0675c0) obj4;
                X x9 = (X) obj3;
                p241y9.e eVar = (p241y9.e) obj2;
                Boolean bool = (Boolean) obj;
                if (bool.booleanValue() && c0675c0.g() == 1) {
                    c0675c0.h(2);
                }
                x9.setValue(bool);
                eVar.invoke(bool, Integer.valueOf(c0675c0.g()));
                return yVar;
            case 2:
                Integer num = (Integer) obj;
                ((C0675c0) obj4).h(num.intValue());
                ((p241y9.e) obj3).invoke(((X) obj2).getValue(), num);
                return yVar;
            case 3:
                k3.h hVar = (k3.h) obj4;
                ReminderSettingsActivity reminderSettingsActivity = (ReminderSettingsActivity) obj3;
                X x10 = (X) obj2;
                LocalTime localTime = (LocalTime) obj;
                int i13 = ReminderSettingsActivity.f13864a0;
                p251z9.j.e(localTime, "time");
                p150o9.c cVar = null;
                if (hVar instanceof k3.f) {
                    AbstractC0405x.x(reminderSettingsActivity.f13865W, null, new S5.b(reminderSettingsActivity, hVar, localTime, cVar, 0), 3);
                } else if (!(hVar instanceof k3.g)) {
                    throw new A6.a();
                }
                x10.setValue(null);
                return yVar;
            case 4:
                LocalTime localTime2 = (LocalTime) obj;
                int i14 = KhatmahWrapper.f13794v;
                p251z9.j.e(localTime2, "time");
                AbstractC0405x.x((InterfaceC0402u) obj4, null, new Z4.f((KhatmahWrapper) obj2, localTime2, null, i11), 3);
                ((X) obj3).setValue(null);
                return yVar;
            case 5:
                p063g1.c cVar2 = (p063g1.c) obj3;
                QuranAyahTextView quranAyahTextView = (QuranAyahTextView) obj;
                p251z9.j.e(quranAyahTextView, "textView");
                p124m3.j jVar = ((p047e5.i) obj4).f15819b;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(jVar.f19590f);
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) "  ");
                float f3 = 23;
                int density = (int) (((double) (cVar2.getDensity() * f3)) * 0.85d);
                float f7 = density;
                Y3.m mVar = new Y3.m((Context) obj2, jVar, new Y3.t(16));
                mVar.a(cVar2.getDensity() * f3);
                mVar.setBounds(0, 0, density, (int) (1.3333334f * f7));
                spannableStringBuilder.setSpan(new p089i4.a(mVar, f7 * (-0.35f)), length + 1, spannableStringBuilder.length(), 17);
                quranAyahTextView.setText(spannableStringBuilder);
                return yVar;
            case 6:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                ((p241y9.f) obj4).d((k3.h) obj3, bool2, (LocalTime) obj2);
                return yVar;
            case 7:
                p093j0.r rVar = (p093j0.r) obj4;
                p173r2.j jVar2 = (p173r2.j) obj3;
                rVar.add(jVar2);
                return new C0629a((p181s2.q) obj2, jVar2, rVar, i12);
            default:
                L0 l10 = (L0) obj3;
                G g = (G) obj;
                p251z9.j.e(g, "$this$graphicsLayer");
                g.e(((Number) l10.getValue()).floatValue());
                g.f(((Number) l10.getValue()).floatValue());
                g.a(((Number) ((L0) obj2).getValue()).floatValue());
                g.l(((M) ((X) obj4).getValue()).f21816a);
                return yVar;
        }
    }
}
