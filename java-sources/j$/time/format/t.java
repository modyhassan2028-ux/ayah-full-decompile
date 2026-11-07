package j$.time.format;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.ZonedDateTime;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.SoftReference;
import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes2.dex */
public final class t extends s {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ConcurrentHashMap f17907i = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextStyle f17908e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f17909f;
    public final Map g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map f17910h;

    public t(TextStyle textStyle, boolean z10) {
        super(j$.time.temporal.n.f17983e, "ZoneText(" + textStyle + ")");
        this.g = new HashMap();
        this.f17910h = new HashMap();
        this.f17908e = (TextStyle) Objects.requireNonNull(textStyle, "textStyle");
        this.f17909f = z10;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0084  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // j$.time.format.s, j$.time.format.InterfaceC1057e
    public final boolean k(y yVar, StringBuilder sb) {
        boolean zG;
        String[] strArr;
        ZoneId zoneId = (ZoneId) yVar.b(j$.time.temporal.n.f17979a);
        if (zoneId == null) {
            return false;
        }
        String strJ = zoneId.j();
        if (!(zoneId instanceof ZoneOffset)) {
            TemporalAccessor temporalAccessor = yVar.f17928a;
            String str = null;
            Map concurrentHashMap = null;
            if (this.f17909f) {
                zG = 2;
            } else if (temporalAccessor.e(ChronoField.INSTANT_SECONDS)) {
                zG = zoneId.R().g(Instant.R(temporalAccessor));
            } else {
                ChronoField chronoField = ChronoField.EPOCH_DAY;
                if (temporalAccessor.e(chronoField)) {
                    ChronoField chronoField2 = ChronoField.NANO_OF_DAY;
                    if (temporalAccessor.e(chronoField2)) {
                        LocalDateTime localDateTimeT = LocalDateTime.T(LocalDate.d0(temporalAccessor.D(chronoField)), LocalTime.V(temporalAccessor.D(chronoField2)));
                        Object objE = zoneId.R().e(localDateTimeT);
                        if ((objE instanceof j$.time.zone.b ? (j$.time.zone.b) objE : null) == null) {
                            j$.time.zone.f fVarR = zoneId.R();
                            ZonedDateTime zonedDateTimeR = ZonedDateTime.R(localDateTimeT, zoneId, null);
                            zG = fVarR.g(Instant.S(j$.com.android.tools.r8.a.w(zonedDateTimeR), zonedDateTimeR.f17768a.f17749b.f17756d));
                        } else {
                            zG = 2;
                        }
                    } else {
                        zG = 2;
                    }
                } else {
                    zG = 2;
                }
            }
            Locale locale = yVar.f17929b.f17850b;
            TextStyle textStyle = TextStyle.NARROW;
            TextStyle textStyle2 = this.f17908e;
            if (textStyle2 != textStyle) {
                ConcurrentHashMap concurrentHashMap2 = f17907i;
                SoftReference softReference = (SoftReference) concurrentHashMap2.get(strJ);
                if (softReference == null || (concurrentHashMap = (Map) softReference.get()) == null || (strArr = (String[]) concurrentHashMap.get(locale)) == null) {
                    TimeZone timeZone = TimeZone.getTimeZone(strJ);
                    String[] strArr2 = {strJ, timeZone.getDisplayName(false, 1, locale), timeZone.getDisplayName(false, 0, locale), timeZone.getDisplayName(true, 1, locale), timeZone.getDisplayName(true, 0, locale), strJ, strJ};
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    concurrentHashMap.put(locale, strArr2);
                    concurrentHashMap2.put(strJ, new SoftReference(concurrentHashMap));
                    strArr = strArr2;
                }
                if (zG != 0) {
                    str = zG != 1 ? strArr[textStyle2.f17863a + 5] : strArr[textStyle2.f17863a + 3];
                } else {
                    str = strArr[textStyle2.f17863a + 1];
                }
            }
            if (str != null) {
                strJ = str;
            }
        }
        sb.append(strJ);
        return true;
    }

    @Override // j$.time.format.s
    public final m a(v vVar) {
        m mVar;
        if (this.f17908e == TextStyle.NARROW) {
            return super.a(vVar);
        }
        Locale locale = vVar.f17919a.f17850b;
        boolean z10 = vVar.f17920b;
        Set set = j$.time.zone.i.f18041d;
        int size = set.size();
        Map map = z10 ? this.g : this.f17910h;
        Map.Entry entry = (Map.Entry) map.get(locale);
        if (entry != null && ((Integer) entry.getKey()).intValue() == size && (mVar = (m) ((SoftReference) entry.getValue()).get()) != null) {
            return mVar;
        }
        m mVar2 = vVar.f17920b ? new m("", null, null) : new l("", null, null);
        for (String[] strArr : DateFormatSymbols.getInstance(locale).getZoneStrings()) {
            String str = strArr[0];
            if (set.contains(str)) {
                mVar2.a(str, str);
                HashMap map2 = (HashMap) G.f17859d;
                String str2 = (String) map2.get(str);
                if (str2 == null) {
                    HashMap map3 = (HashMap) G.g;
                    if (map3.containsKey(str)) {
                        str = (String) map3.get(str);
                        str2 = (String) map2.get(str);
                    }
                }
                if (str2 != null) {
                    Map map4 = (Map) ((HashMap) G.f17861f).get(str2);
                    str = (map4 == null || !map4.containsKey(locale.getCountry())) ? (String) ((HashMap) G.f17860e).get(str2) : (String) map4.get(locale.getCountry());
                }
                HashMap map5 = (HashMap) G.g;
                if (map5.containsKey(str)) {
                    str = (String) map5.get(str);
                }
                for (int i10 = this.f17908e == TextStyle.FULL ? 1 : 2; i10 < strArr.length; i10 += 2) {
                    mVar2.a(strArr[i10], str);
                }
            }
        }
        map.put(locale, new AbstractMap.SimpleImmutableEntry(Integer.valueOf(size), new SoftReference(mVar2)));
        return mVar2;
    }
}
