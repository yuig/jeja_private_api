package pl.jeja.android.app.h;

import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import pl.jeja.android.App;
import pl.jeja.android.R;
import pl.jeja.android.app.AppActivity;
import pl.jeja.android.app.h.o;
import pl.jeja.android.app.images.u0;
import pl.jeja.android.app.images.v0;
import pl.jeja.android.c.m.h;
/* compiled from: JokesFragment.java */
/* loaded from: classes.dex */
public class q extends pl.jeja.android.c.c implements SwipeRefreshLayout.j {
    private ArrayList<pl.jeja.android.c.k.b> Y;
    private r Z;
    private pl.jeja.android.c.m.h a0;
    private pl.jeja.android.c.m.h b0;
    private pl.jeja.android.c.m.h c0;
    private AppActivity d0;
    private SwipeRefreshLayout e0;
    private MenuItem f0;
    private n g0;
    private n h0;
    private ListView i0;
    private ProgressBar j0;
    private LinearLayout k0;
    private LinearLayout l0;
    private TextView m0;
    private TextView n0;
    private ImageView o0;
    private String p0;
    private String q0;
    private String s0;
    private boolean u0;
    private boolean v0;
    private com.google.android.gms.ads.j y0;
    private String r0 = "0";
    private int t0 = 0;
    private boolean w0 = false;
    private boolean x0 = false;

    /* compiled from: JokesFragment.java */
    /* loaded from: classes.dex */
    class a extends com.google.android.gms.ads.c {
        a() {
        }

        @Override // com.google.android.gms.ads.c
        public void f() {
            super.f();
            q.this.t2();
        }

        @Override // com.google.android.gms.ads.c
        public void l() {
            super.l();
            ((App) q.this.l().getApplication()).f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: JokesFragment.java */
    /* loaded from: classes.dex */
    public class b implements AbsListView.OnScrollListener {
        b() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i2, int i3, int i4) {
            q.this.e0.setEnabled(i2 == 0 && ((q.this.i0 == null || q.this.i0.getChildCount() == 0) ? 0 : q.this.i0.getChildAt(0).getTop()) >= 0 && !q.this.u0);
            if (q.this.Y.size() == 0 || q.this.u0 || i2 + i3 != i4 || i3 >= i4 || q.this.t0 < 10 || i4 <= 2 || q.this.w0) {
                return;
            }
            AbsListView.LayoutParams layoutParams = (AbsListView.LayoutParams) q.this.l0.getLayoutParams();
            layoutParams.height = (int) TypedValue.applyDimension(1, 56.0f, q.this.F().getDisplayMetrics());
            q.this.l0.setLayoutParams(layoutParams);
            q.this.j0.setVisibility(0);
            q.this.E2();
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i2) {
        }
    }

    private h.a<ArrayList<pl.jeja.android.app.f.a>> A2() {
        return new h.a() { // from class: pl.jeja.android.app.h.m
            @Override // pl.jeja.android.c.m.h.a
            public final void e(Object obj, Object obj2) {
                q.this.m2((ArrayList) obj, obj2);
            }
        };
    }

    private h.b B2() {
        return new h.b() { // from class: pl.jeja.android.app.h.g
            @Override // pl.jeja.android.c.m.h.b
            public final void a(pl.jeja.android.c.m.g gVar) {
                q.this.o2(gVar);
            }
        };
    }

    private h.a<ArrayList<u0>> C2() {
        return new h.a() { // from class: pl.jeja.android.app.h.l
            @Override // pl.jeja.android.c.m.h.a
            public final void e(Object obj, Object obj2) {
                q.this.q2((ArrayList) obj, obj2);
            }
        };
    }

    private h.a<ArrayList<n>> D2() {
        return new h.a() { // from class: pl.jeja.android.app.h.c
            @Override // pl.jeja.android.c.m.h.a
            public final void e(Object obj, Object obj2) {
                q.this.s2((ArrayList) obj, obj2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E2() {
        this.k0.setVisibility(8);
        if (this.t0 == 0 && !this.Y.isEmpty()) {
            this.Y.clear();
            this.Z.notifyDataSetChanged();
        }
        this.u0 = true;
        this.a0.c("Jokes", "GetJokes", pl.jeja.android.c.m.l.d(PreferenceManager.getDefaultSharedPreferences(l()), this.r0, this.q0, this.p0, this.t0, this.s0, this.x0), D2(), x2());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F2(n nVar, boolean z) {
        this.h0 = nVar;
        HashMap<String, String> l = pl.jeja.android.c.m.l.l(PreferenceManager.getDefaultSharedPreferences(l()), this.h0.a(), z);
        pl.jeja.android.c.i.j(l());
        this.b0.c("Jokes", "VoteUpDown", l, C2(), B2());
    }

    private void S1() {
        this.i0.setOnScrollListener(new b());
        this.n0.setOnClickListener(new View.OnClickListener() { // from class: pl.jeja.android.app.h.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                q.this.X1(view);
            }
        });
    }

    private void T1() {
        if (l() != null) {
            r rVar = new r(l(), this.Y, this.q0, new o.d() { // from class: pl.jeja.android.app.h.i
                @Override // pl.jeja.android.app.h.o.d
                public final void a(n nVar, boolean z) {
                    q.this.F2(nVar, z);
                }
            }, new o.c() { // from class: pl.jeja.android.app.h.f
                @Override // pl.jeja.android.app.h.o.c
                public final void a(n nVar) {
                    q.this.Z1(nVar);
                }
            }, new o.a() { // from class: pl.jeja.android.app.h.d
                @Override // pl.jeja.android.app.h.o.a
                public final void a(n nVar) {
                    q.this.b2(nVar);
                }
            });
            this.Z = rVar;
            this.i0.setAdapter((ListAdapter) rVar);
        }
    }

    private void U1() {
        this.k0 = (LinearLayout) l().findViewById(R.id.error_layout);
        this.o0 = (ImageView) l().findViewById(R.id.connection_image);
        TextView textView = (TextView) l().findViewById(R.id.error_text);
        this.m0 = textView;
        textView.setTypeface(pl.jeja.android.c.b.e());
        TextView textView2 = (TextView) l().findViewById(R.id.error_bottom);
        this.n0 = textView2;
        textView2.setTypeface(pl.jeja.android.c.b.e());
        ListView listView = (ListView) l().findViewById(R.id.list);
        this.i0 = listView;
        listView.addFooterView(((LayoutInflater) l().getSystemService("layout_inflater")).inflate(R.layout.list_footer, (ViewGroup) null, false));
        this.i0.addHeaderView(((LayoutInflater) l().getSystemService("layout_inflater")).inflate(R.layout.list_header, (ViewGroup) null, false));
        this.l0 = (LinearLayout) l().findViewById(R.id.footer_layout);
        ProgressBar progressBar = (ProgressBar) l().findViewById(R.id.progress_bar_list_footer);
        this.j0 = progressBar;
        progressBar.setVisibility(8);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) l().findViewById(R.id.swiperefresh);
        this.e0 = swipeRefreshLayout;
        swipeRefreshLayout.setColorSchemeResources(R.color.navy_blue, R.color.orange);
        this.e0.setOnRefreshListener(this);
    }

    private void V1() {
        this.d0 = (AppActivity) l();
        this.Y = new ArrayList<>();
        this.a0 = new pl.jeja.android.c.m.h(l(), new p());
        this.b0 = new pl.jeja.android.c.m.h(l(), new v0());
        this.c0 = new pl.jeja.android.c.m.h(l(), new pl.jeja.android.app.f.b());
        this.s0 = Build.MODEL.toLowerCase();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W1 */
    public /* synthetic */ void X1(View view) {
        if (this.v0) {
            this.n0.setVisibility(8);
            this.w0 = false;
            G1();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y1 */
    public /* synthetic */ void Z1(n nVar) {
        this.g0 = nVar;
        v2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a2 */
    public /* synthetic */ void b2(n nVar) {
        if (this.y0.b() && ((App) l().getApplication()).e()) {
            this.y0.i();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d2 */
    public /* synthetic */ void e2() {
        this.e0.setRefreshing(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f2 */
    public /* synthetic */ void g2(pl.jeja.android.c.m.g gVar) {
        this.e0.setRefreshing(false);
        this.u0 = false;
        ProgressBar progressBar = this.j0;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        MenuItem menuItem = this.f0;
        if (menuItem != null) {
            menuItem.setVisible(true);
            this.d0.I(false);
        }
        if (gVar.a() == 500) {
            this.v0 = true;
            if (this.Y.isEmpty()) {
                this.t0 = 0;
                this.w0 = false;
                this.k0.setVisibility(0);
                this.m0.setText(R.string.connection_error);
                this.o0.setVisibility(0);
            } else {
                this.n0.setVisibility(0);
                this.n0.setText(R.string.connection_error_bottom);
            }
        }
        if (gVar.a() == 204) {
            this.v0 = false;
            this.o0.setVisibility(8);
            if (!TextUtils.isEmpty(this.p0)) {
                ArrayList<pl.jeja.android.c.k.b> arrayList = this.Y;
                if (arrayList != null && !arrayList.isEmpty()) {
                    this.n0.setVisibility(0);
                    this.n0.setText(R.string.no_more_search_results);
                } else {
                    this.t0 = 0;
                    this.w0 = false;
                    this.k0.setVisibility(0);
                    this.m0.setText(R.string.no_search_results);
                }
            } else if (this.q0.equals("FAVORITES")) {
                if (this.Y.isEmpty()) {
                    this.k0.setVisibility(0);
                    this.m0.setText(R.string.no_favs);
                } else {
                    this.w0 = true;
                }
            } else if (this.q0.equals("ADDED_BY_USER")) {
                if (this.Y.isEmpty()) {
                    this.k0.setVisibility(0);
                    this.m0.setText(R.string.no_joke_added_by_user);
                }
            } else {
                ArrayList<pl.jeja.android.c.k.b> arrayList2 = this.Y;
                if (arrayList2 != null && arrayList2.isEmpty()) {
                    this.t0 = 0;
                    this.w0 = false;
                    this.k0.setVisibility(0);
                    this.m0.setText(R.string.no_data_found);
                }
            }
        }
        if (gVar.a() == 400) {
            this.v0 = true;
            if (this.Y.isEmpty()) {
                this.k0.setVisibility(0);
                this.o0.setVisibility(0);
                this.m0.setText(R.string.something_went_wrong);
                return;
            }
            this.n0.setVisibility(0);
            this.n0.setText(R.string.something_went_wrong);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h2 */
    public /* synthetic */ void i2(ArrayList arrayList, Object obj) {
        l().setRequestedOrientation(-1);
        this.g0.l(true);
        this.g0.m(((pl.jeja.android.app.f.a) arrayList.get(0)).a());
        Toast.makeText(l(), (int) R.string.added_to_favs, 0).show();
        this.Z.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j2 */
    public /* synthetic */ void k2(pl.jeja.android.c.m.g gVar) {
        l().setRequestedOrientation(-1);
        this.Z.notifyDataSetChanged();
        Toast.makeText(l(), gVar.b(), 0).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l2 */
    public /* synthetic */ void m2(ArrayList arrayList, Object obj) {
        l().setRequestedOrientation(-1);
        this.g0.l(false);
        if (this.d0.W().equals("FAVORITES")) {
            this.Y.remove(this.g0);
        } else {
            this.g0.m(((pl.jeja.android.app.f.a) arrayList.get(0)).a());
        }
        Toast.makeText(l(), (int) R.string.removed_from_favs, 0).show();
        this.Z.notifyDataSetChanged();
        if (this.Y.isEmpty()) {
            this.k0.setVisibility(0);
            this.m0.setText(R.string.no_favs);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n2 */
    public /* synthetic */ void o2(pl.jeja.android.c.m.g gVar) {
        l().setRequestedOrientation(-1);
        this.Z.notifyDataSetChanged();
        Toast.makeText(l(), gVar.b(), 0).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p2 */
    public /* synthetic */ void q2(ArrayList arrayList, Object obj) {
        l().setRequestedOrientation(-1);
        u0 u0Var = (u0) arrayList.get(0);
        this.h0.o(u0Var.c());
        this.h0.n(u0Var.b());
        this.h0.q(u0Var.e());
        this.h0.p(u0Var.d());
        Toast.makeText(l(), u0Var.a(), 0).show();
        this.Z.notifyDataSetChanged();
        if (this.Y.isEmpty()) {
            this.k0.setVisibility(0);
            this.m0.setText(R.string.no_favs);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r2 */
    public /* synthetic */ void s2(ArrayList arrayList, Object obj) {
        this.e0.setRefreshing(false);
        this.u0 = false;
        ProgressBar progressBar = this.j0;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        MenuItem menuItem = this.f0;
        if (menuItem != null) {
            menuItem.setVisible(true);
            this.d0.I(false);
        }
        this.k0.setVisibility(8);
        this.n0.setVisibility(8);
        ArrayList arrayList2 = new ArrayList(arrayList);
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                if (obj2 instanceof Integer) {
                    arrayList2.add(((Integer) obj2).intValue(), new pl.jeja.android.c.l.d());
                }
            }
        }
        if (this.t0 == 0) {
            T1();
        }
        this.Y.addAll(arrayList2);
        this.Z.notifyDataSetChanged();
        this.t0 += arrayList.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t2() {
    }

    private void v2() {
        HashMap<String, String> b2 = pl.jeja.android.c.m.l.b(PreferenceManager.getDefaultSharedPreferences(l()), this.g0.a());
        pl.jeja.android.c.i.j(l());
        if (this.g0.i()) {
            this.c0.c("Jokes", "RemoveFromFavorites", b2, A2(), z2());
        } else {
            this.c0.c("Jokes", "AddToFavorites", b2, y2(), z2());
        }
    }

    public static q w2(String str, String str2) {
        q qVar = new q();
        Bundle bundle = new Bundle();
        bundle.putString("AppActivity.KEY_SORT_TYPE", str);
        bundle.putString("AppActivity.KEY_SEARCH_QUERY", str2);
        qVar.q1(bundle);
        return qVar;
    }

    private h.b x2() {
        return new h.b() { // from class: pl.jeja.android.app.h.k
            @Override // pl.jeja.android.c.m.h.b
            public final void a(pl.jeja.android.c.m.g gVar) {
                q.this.g2(gVar);
            }
        };
    }

    private h.a<ArrayList<pl.jeja.android.app.f.a>> y2() {
        return new h.a() { // from class: pl.jeja.android.app.h.b
            @Override // pl.jeja.android.c.m.h.a
            public final void e(Object obj, Object obj2) {
                q.this.i2((ArrayList) obj, obj2);
            }
        };
    }

    private h.b z2() {
        return new h.b() { // from class: pl.jeja.android.app.h.h
            @Override // pl.jeja.android.c.m.h.b
            public final void a(pl.jeja.android.c.m.g gVar) {
                q.this.k2(gVar);
            }
        };
    }

    @Override // androidx.fragment.app.Fragment
    public void E0(Bundle bundle) {
        super.E0(bundle);
        AppActivity appActivity = (AppActivity) l();
        this.d0 = appActivity;
        if (appActivity.S() == this) {
            bundle.putString("AppActivity.KEY_SORT_TYPE", this.q0);
            bundle.putString("AppActivity.KEY_SEARCH_QUERY", this.p0);
            bundle.putString("AppActivity.KEY_ID_USER", this.r0);
            bundle.putInt("AppActivity.KEY_OFFSET", this.t0);
            bundle.putBoolean("AppActivity.KEY_LOCK_LOAD_MORE", this.w0);
            ArrayList<pl.jeja.android.c.k.b> arrayList = this.Y;
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            bundle.putParcelableArrayList("jokesList", this.Y);
        }
    }

    @Override // pl.jeja.android.c.c
    public void G1() {
        super.G1();
        E2();
    }

    @Override // pl.jeja.android.c.c
    public void H1(MenuItem menuItem) {
        super.H1(menuItem);
        this.t0 = 0;
        this.w0 = false;
        this.n0.setVisibility(8);
        this.k0.setVisibility(8);
        this.o0.setVisibility(8);
        this.e0.setRefreshing(true);
        this.f0 = menuItem;
        E2();
    }

    @Override // androidx.fragment.app.Fragment
    public void b0(Bundle bundle) {
        super.b0(bundle);
        ((App) l().getApplication()).g(l(), "Lista Dowcipów", q.class.getSimpleName());
        if (l() != null) {
            com.google.android.gms.ads.j jVar = new com.google.android.gms.ads.j(l());
            this.y0 = jVar;
            jVar.f(M(R.string.ad_fullscreen));
            this.y0.d(new a());
            t2();
        }
        V1();
        U1();
        if (q() != null) {
            this.q0 = q().getString("AppActivity.KEY_SORT_TYPE");
            this.p0 = q().getString("AppActivity.KEY_SEARCH_QUERY");
            this.t0 = 0;
            this.w0 = false;
            if (PreferenceManager.getDefaultSharedPreferences(l()).contains("login")) {
                this.r0 = PreferenceManager.getDefaultSharedPreferences(l()).getString("userId", "");
            }
            if (this.q0.equals("FAVORITES")) {
                this.x0 = true;
            }
            if (bundle != null && bundle.getParcelableArrayList("jokesList") == null) {
                E2();
            }
        }
        T1();
        S1();
        if (bundle != null && bundle.getParcelableArrayList("jokesList") != null) {
            this.q0 = bundle.getString("AppActivity.KEY_SORT_TYPE");
            this.r0 = bundle.getString("AppActivity.KEY_ID_USER");
            this.t0 = bundle.getInt("AppActivity.KEY_OFFSET");
            this.Y.addAll(bundle.getParcelableArrayList("jokesList"));
            this.w0 = bundle.getBoolean("AppActivity.KEY_LOCK_LOAD_MORE", false);
            this.Z.notifyDataSetChanged();
        }
        if (bundle == null) {
            this.e0.post(new Runnable() { // from class: pl.jeja.android.app.h.j
                @Override // java.lang.Runnable
                public final void run() {
                    q.this.e2();
                }
            });
            E2();
        } else {
            this.Z.notifyDataSetChanged();
        }
        String str = this.p0;
        if (str != null && !str.equals("")) {
            this.d0.B().G(R.string.jokes);
            this.d0.B().E(R.string.search_results);
        } else {
            this.d0.e0("JOKES", this.q0);
        }
        this.d0.f0("JOKES");
        this.d0.i0(this.q0);
        this.d0.g0(this);
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.j
    public void h() {
        this.t0 = 0;
        this.w0 = false;
        this.n0.setVisibility(8);
        G1();
    }

    @Override // androidx.fragment.app.Fragment
    public View m0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.jokes_fragment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void p0() {
        super.p0();
        this.d0.g0(null);
    }

    @Override // pl.jeja.android.c.c
    /* renamed from: u2 */
    public q E1(String str, String str2) {
        return w2(str, str2);
    }
}
