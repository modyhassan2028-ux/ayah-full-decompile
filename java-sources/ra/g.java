package ra;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d[] f21672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f21673b;

    static {
        d dVar = new d(d.f21655i, "");
        Da.k kVar = d.f21653f;
        d dVar2 = new d(kVar, "GET");
        d dVar3 = new d(kVar, "POST");
        Da.k kVar2 = d.g;
        d dVar4 = new d(kVar2, "/");
        d dVar5 = new d(kVar2, "/index.html");
        Da.k kVar3 = d.f21654h;
        d dVar6 = new d(kVar3, "http");
        d dVar7 = new d(kVar3, "https");
        Da.k kVar4 = d.f21652e;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, new d(kVar4, "200"), new d(kVar4, "204"), new d(kVar4, "206"), new d(kVar4, "304"), new d(kVar4, "400"), new d(kVar4, "404"), new d(kVar4, "500"), new d("accept-charset", ""), new d("accept-encoding", "gzip, deflate"), new d("accept-language", ""), new d("accept-ranges", ""), new d("accept", ""), new d("access-control-allow-origin", ""), new d("age", ""), new d("allow", ""), new d("authorization", ""), new d("cache-control", ""), new d("content-disposition", ""), new d("content-encoding", ""), new d("content-language", ""), new d("content-length", ""), new d("content-location", ""), new d("content-range", ""), new d("content-type", ""), new d("cookie", ""), new d("date", ""), new d("etag", ""), new d("expect", ""), new d("expires", ""), new d("from", ""), new d("host", ""), new d("if-match", ""), new d("if-modified-since", ""), new d("if-none-match", ""), new d("if-range", ""), new d("if-unmodified-since", ""), new d("last-modified", ""), new d("link", ""), new d("location", ""), new d("max-forwards", ""), new d("proxy-authenticate", ""), new d("proxy-authorization", ""), new d("range", ""), new d("referer", ""), new d("refresh", ""), new d("retry-after", ""), new d("server", ""), new d("set-cookie", ""), new d("strict-transport-security", ""), new d("transfer-encoding", ""), new d("user-agent", ""), new d("vary", ""), new d("via", ""), new d("www-authenticate", "")};
        f21672a = dVarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61, 1.0f);
        for (int i10 = 0; i10 < 61; i10++) {
            if (!linkedHashMap.containsKey(dVarArr[i10].f21656a)) {
                linkedHashMap.put(dVarArr[i10].f21656a, Integer.valueOf(i10));
            }
        }
        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(linkedHashMap);
        p251z9.j.d(mapUnmodifiableMap, "unmodifiableMap(...)");
        f21673b = mapUnmodifiableMap;
    }

    public static void a(Da.k kVar) throws IOException {
        p251z9.j.e(kVar, "name");
        int iA = kVar.a();
        for (int i10 = 0; i10 < iA; i10++) {
            byte bD = kVar.d(i10);
            if (65 <= bD && bD < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(kVar.k()));
            }
        }
    }
}
