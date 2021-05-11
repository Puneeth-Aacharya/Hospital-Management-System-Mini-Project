<!DOCTYPE html>
<!-- saved from url=(0089)https://github.com/Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM/blob/main/DBMS_QUERIES.sql -->
<html lang="en" data-color-mode="dark" data-light-theme="light" data-dark-theme="dark"><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    
  <link rel="dns-prefetch" href="https://github.githubassets.com/">
  <link rel="dns-prefetch" href="https://avatars.githubusercontent.com/">
  <link rel="dns-prefetch" href="https://github-cloud.s3.amazonaws.com/">
  <link rel="dns-prefetch" href="https://user-images.githubusercontent.com/">



  <link crossorigin="anonymous" media="all" integrity="sha512-sf1Ppoo8CVx+YA47iIi2IUMYtjH17Errad0dPA+lo7DVd6VW1Mdy+TBcpD06Z6FN8MKI7TH5fpYU33+DhP25kg==" rel="stylesheet" href="./DBMS_QUERIES_files/frameworks-b1fd4fa68a3c095c7e600e3b8888b621.css">
    <link crossorigin="anonymous" media="all" integrity="sha512-s0k4j2N8siAT3sHdOY7FyBnTG/wPUK84cocvLnKjLbzJwfls0NAQ+DdH+YXK8ZrO1xuUPpF7QiQZytE5rKdByg==" rel="stylesheet" href="./DBMS_QUERIES_files/behaviors-b349388f637cb22013dec1dd398ec5c8.css">
    
    
    
    <link crossorigin="anonymous" media="all" integrity="sha512-IwoajEOel02eeTohMnWahFUlLFlQR2D7ze3SyG2bEzVQ/BE62mymz1R2v9S2LQgaduGAMOG8Zf05OpGuu7Kh7Q==" rel="stylesheet" href="./DBMS_QUERIES_files/github-230a1a8c439e974d9e793a2132759a84.css">

  <script crossorigin="anonymous" defer="defer" integrity="sha512-CzeY4A6TiG4fGZSWZU8FxmzFFmcQFoPpArF0hkH0/J/S7UL4eed/LKEXMQXfTwiG5yEJBI+9BdKG8KQJNbhcIQ==" type="application/javascript" src="./DBMS_QUERIES_files/environment-0b3798e0.js.download"></script>
    <script crossorigin="anonymous" defer="defer" integrity="sha512-EvjMMwAw15kv+aXQKcim6r34woZPJZnQ2RHEwWrGtzBPz2MNxwzB5rsBht5mjJ2fbLQwLrXdF1jEvRbq7cFcZQ==" type="application/javascript" src="./DBMS_QUERIES_files/chunk-frameworks-12f8cc33.js.download"></script>
    <script crossorigin="anonymous" defer="defer" integrity="sha512-yakjM7b2IGtqO51Ujy99D+xFW4sBud72051Q569rNIrcKwPuO7bjJfmfBVvUGTQlvn9PHHxmlwcGC2dx3eKKbA==" type="application/javascript" src="./DBMS_QUERIES_files/chunk-vendor-c9a92333.js.download"></script>
  
  <script crossorigin="anonymous" defer="defer" integrity="sha512-vwL6dblmF/FoGOe7jqQHO9tTp2gPmPQcm/fQbfmCjIi/pPChY1SW3br54+RJnfcek29dU43Pjmv0ZGVfn31YbQ==" type="application/javascript" src="./DBMS_QUERIES_files/behaviors-bf02fa75.js.download"></script>
  
    <script crossorigin="anonymous" defer="defer" integrity="sha512-tjuNQcwhEIXGvVIG4XM/Aj4z+Od+NBRkbgWNwEMjGL3nsnAmdoBdbzsn/WTvl3hk+TPt1D0BvBLHLBPgiwvT2w==" type="application/javascript" data-module-id="./chunk-animate-on-scroll.js" data-src="https://github.githubassets.com/assets/chunk-animate-on-scroll-b63b8d41.js"></script>
    <script crossorigin="anonymous" defer="defer" integrity="sha512-+BKEtK9JkmJ52jKSoX6+SBrGV6kJxB8J/iAPkFQ/oeq8YekNcz7IZlJgM5Tddyx1RrkL3+sdG0tAy3YuFbYqfA==" type="application/javascript" data-module-id="./chunk-codemirror.js" data-src="https://github.githubassets.com/assets/chunk-codemirror-f81284b4.js"></script>
    <script crossorigin="anonymous" defer="defer" integrity="sha512-EKOvqJ9uTatAt87WxU+OSS4mi7gMUszFbGo4aPErQkjpWLXnrPSeZvK5ngU8OYoIoiVOq+v8dA3C6MF/z2d/kA==" type="application/javascript" data-module-id="./chunk-color-modes.js" src="./DBMS_QUERIES_files/chunk-color-modes-10a3afa8.js.download"></script>
    <script crossorigin="anonymous" defer="defer" integrity="sha512-zkYZSjUFqSifB+Lt76jclFMrfqpcPqevT801RZcoBNCZHRTBKcFrW9OyJoPOzKFv+fZVDRnqdqGsuIv5KOIgZg==" type="application/javascript" data-module-id="./chunk-contributions-spider-graph.js" data-src="https://github.githubassets.com/assets/chunk-contributions-spider-graph-ce46194a.js"></script>
    <script crossorigin="anonymous" defer="defer" integrity="sha512-6j/oSF+kbW+yetNPvI684VzAu9pzug6Vj2h+3u1LdCuRhR4jnuiHZfeQKls3nxcT/S3H+oIt7FtigE/aeoj+gg==" type="application/javascript" data-module-id="./chunk-drag-drop.js" data-src="https://github.githubassets.com/assets/chunk-drag-drop-ea3fe848.js"></script>
    <script crossorigin="anonymous" defer="defer" integrity="sha512-VSSd+Yzi2iMS+pibY6hD/WdypxAEdob5F2RMKxuKcAHS2EpFYJPeTXoVxt0NXg03tfj2dka2mEtHS+vjpYSaDw==" type="application/javascript" data-module-id="./chunk-edit-hook-secret-element.js" data-src="https://github.githubassets.com/assets/chunk-edit-hook-secret-element-55249df9.js"></script>
    <script crossorigin="anonymous" defer="defer" integrity="sha512-N+ziqJjVMfWiqeVHdayDHpNRlG5HsF+cgV+pFnMDoTJuvBzgw+ndsepe4NcKAxIS3WMvzMaQcYmd2vrIaoAJVg==" type="application/javascript" data-module-id="./chunk-edit.js" src="./DBMS_QUERIES_files/chunk-edit-37ece2a8.js.download"></script>
    <script crossorigin="anonymous" defer="defer" integrity="sha512-aiqMIGGZGo8AQMjcoImKPMTsZVVRl6htCSY7BpRmpGPG/AF+Wq+P/Oj/dthWQOIk9cCNMPEas7O2zAR6oqn0tA==" type="application/javascript" data-module-id="./chunk-emoji-picker-element.js" data-src="https://github.githubassets.com/assets/chunk-emoji-picker-element-6a2a8c20.js"></script>
    <script crossorigin="anonymous" defer="defer" integrity="sha512-7o8WoXZcP71e0YBbF1az3Rj9iGr3Irk3kb7Yq1/ZQETySta8pQLfupQJ7yiswg+sN1HTqszDMbp1vcPHFgp7gw==" type="application/javascript" data-module-id="./chunk-filter-input.js" data-src="https://github.githubassets.com/assets/chunk-filter-input-ee8f16a1.js"></script>
    <script crossorigin="anonymous" defer="defer" integrity="sha512-XwuQdORq1W9Z+a/i72pH+NfR1rhwlGdxIlaIBbTciscGc/+McxMNLixGBp8e6Td4W1zzHvQ1Jyryl5gUfEr76g==" type="application/javascript" data-module-id="./chunk-insights-graph.js" data-src="https://github.githubassets.com/assets/chunk-insights-graph-5f0b9074.js"></script>
    <script crossorigin="anonymous" defer="defer" integrity="sha512-Y+VVFzGHo9J5bf4Mrn+RGrh1+IExdybA3C1QqPha3UwkV9RZ75jZgV4DsujViAF0iT9OrLYYHvPk9V6QiXjp3g==" type="application/javascript" data-module-id="./chunk-invitations.js" data-src="https://github.githubassets.com/assets/chunk-invitations-63e55517.js"></script>
    <script crossorigin="anonymous" defer="defer" integrity="sha512-mMOvER8Uml4WMYbXv8BaahVq9eF1v5Hu7M9/3oPlOFPmTJGH+TmvcRPt8fddj86urb+Ri+vlqotFspA/4STDsQ==" type="application/javascript" data-module-id="./chunk-jump-to.js" data-src="https://github.githubassets.com/assets/chunk-jump-to-98c3af11.js"></script>
    <script crossorigin="anonymous" defer="defer" integrity="sha512-supZkxo+OPYLNtLXxI+e1dkCqVySu4FOWX1fiVVFs2ZggygppNsEz4F9wVp4YtH2TjFsZW8r/75uDUhPneO2sA==" type="application/javascript" data-module-id="./chunk-notification-list-focus.js" src="./DBMS_QUERIES_files/chunk-notification-list-focus-b2ea5993.js.download"></script>
    <script crossorigin="anonymous" defer="defer" integrity="sha512-ma0OOy3nj0c1cqBx0BkcmIFsLqcSZ+MIukQxyEFM/OWTzZpG+QMgOoWPAHZz43M6fyjAUG1jH6c/6LPiiKPCyw==" type="application/javascript" data-module-id="./chunk-profile-pins-element.js" data-src="https://github.githubassets.com/assets/chunk-profile-pins-element-99ad0e3b.js"></script>
    <script crossorigin="anonymous" defer="defer" integrity="sha512-zh+tYYvd4W00us1O4PkhmKsl/CzInIyrdoMqV2xqC7XPu06UEHfEMJfOiwidJ5f80SwrdGWogWFuJzLHwRbRgA==" type="application/javascript" data-module-id="./chunk-ref-selector.js" src="./DBMS_QUERIES_files/chunk-ref-selector-ce1fad61.js.download"></script>
    <script crossorigin="anonymous" defer="defer" integrity="sha512-Zii9oRdZ6q2QDNjL5A+me7jwJjMLvs1NiQNHmajUZnn4t9shcBDb4F8l/PQZW26eYfe5065oM7lIOSmbMinA7Q==" type="application/javascript" data-module-id="./chunk-responsive-underlinenav.js" src="./DBMS_QUERIES_files/chunk-responsive-underlinenav-6628bda1.js.download"></script>
    <script crossorigin="anonymous" defer="defer" integrity="sha512-9WNXtB07IyWypiPmkuucspwog4mme9q5GKGMSgd7FI0DPimmg/pEw+aaAofFV1vuWMt9I8H5QpsVtlbHGg1YBA==" type="application/javascript" data-module-id="./chunk-runner-groups.js" data-src="https://github.githubassets.com/assets/chunk-runner-groups-f56357b4.js"></script>
    <script crossorigin="anonymous" defer="defer" integrity="sha512-fIq9Mn7jY/bHQXnsmh+VejpDnaO+d/FDxsp+4CuZtdNLrLuO+dQCjh+m6Yd8GCYD2Cy6DWbCEyM+mH2dkB2H9A==" type="application/javascript" data-module-id="./chunk-sortable-behavior.js" data-src="https://github.githubassets.com/assets/chunk-sortable-behavior-7c8abd32.js"></script>
    <script crossorigin="anonymous" defer="defer" integrity="sha512-WK8VXw3lfUQ/VRW0zlgKPhcMUqH0uTnB/KzePUPdZhCm/HpxfXXHKTGvj5C0Oex7+zbIM2ECzULbtTCT4ug3yg==" type="application/javascript" data-module-id="./chunk-toast.js" data-src="https://github.githubassets.com/assets/chunk-toast-58af155f.js"></script>
    <script crossorigin="anonymous" defer="defer" integrity="sha512-vgHJEmEJxNmHucGbVY8bEUoOYo5/ZwpQ69rU8Dld89daWJ54uad9lNptxq32F8pnbHhdngw9lohNEbMbjmj5AQ==" type="application/javascript" data-module-id="./chunk-tweetsodium.js" data-src="https://github.githubassets.com/assets/chunk-tweetsodium-be01c912.js"></script>
    <script crossorigin="anonymous" defer="defer" integrity="sha512-aSxfTHAZj9wv7n08DxgAKkNg7jhiTo4yKKbDqLGxcDxUk/al571Y2ZSsOmLJ0Vh8cuAL8tW+JgX1t0JeKfyfaA==" type="application/javascript" data-module-id="./chunk-user-status-submit.js" data-src="https://github.githubassets.com/assets/chunk-user-status-submit-692c5f4c.js"></script>
  
  <script crossorigin="anonymous" defer="defer" integrity="sha512-/8DIYpYCJFF0xg5QFDVdVJdBQfagC8hDC0Bi5TnoOpswGkZt/Byv4P8wmMYm3r4m6eB8WzeGngZvzA30b8kxiw==" type="application/javascript" src="./DBMS_QUERIES_files/repositories-ffc0c862.js.download"></script>
<script crossorigin="anonymous" defer="defer" integrity="sha512-fWgWSt2h3G19mjo/1ylapwt09Tx463Hwlw8Hd19pnAzz00FsV4zCpHsxcEh5C4U57y9T8DkPdbnwKCsOxRCuVQ==" type="application/javascript" src="./DBMS_QUERIES_files/diffs-7d68164a.js.download"></script>

  <meta name="viewport" content="width=device-width">
  
  <title>HOSPITAL-MANAGEMENT-SYSTEM/DBMS_QUERIES.sql at main · Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM</title>
    <meta name="description" content="Hospital Management System. Contribute to Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM development by creating an account on GitHub.">
    <link rel="search" type="application/opensearchdescription+xml" href="https://github.com/opensearch.xml" title="GitHub">
  <link rel="fluid-icon" href="https://github.com/fluidicon.png" title="GitHub">
  <meta property="fb:app_id" content="1401488693436528">
  <meta name="apple-itunes-app" content="app-id=1477376905">
    <meta name="twitter:image:src" content="https://opengraph.githubassets.com/4eb9ccf92cc3f90ca09b0543fddf46a992c98ae61a4890aa89bd56f9405cbf57/Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM"><meta name="twitter:site" content="@github"><meta name="twitter:card" content="summary_large_image"><meta name="twitter:title" content="Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM"><meta name="twitter:description" content="Hospital Management System. Contribute to Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM development by creating an account on GitHub.">
    <meta property="og:image" content="https://opengraph.githubassets.com/4eb9ccf92cc3f90ca09b0543fddf46a992c98ae61a4890aa89bd56f9405cbf57/Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM"><meta property="og:image:alt" content="Hospital Management System. Contribute to Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM development by creating an account on GitHub."><meta property="og:image:width" content="1200"><meta property="og:image:height" content="600"><meta property="og:site_name" content="GitHub"><meta property="og:type" content="object"><meta property="og:title" content="Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM"><meta property="og:url" content="https://github.com/Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM"><meta property="og:description" content="Hospital Management System. Contribute to Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM development by creating an account on GitHub.">



    

  <link rel="assets" href="https://github.githubassets.com/">
    <link rel="shared-web-socket" href="wss://alive.github.com/_sockets/u/68151137/ws?session=eyJ2IjoiVjMiLCJ1Ijo2ODE1MTEzNywicyI6NjkzNjgyODAwLCJjIjoxMzQ4OTA0NzI3LCJ0IjoxNjIwNzA5NzAxfQ==--288c2f2cc511b1b8ba24114a9f3f2a8e5386542dbb6298d91afe36caaa5d3bd0" data-refresh-url="/_alive" data-session-id="479944bccaccbfb48cf7086ac93c6d973dbcedb76af2e62f2b3060eb940c9be6">
    <link rel="shared-web-socket-src" href="https://github.com/socket-worker-3f088aa2.js">
  <link rel="sudo-modal" href="https://github.com/sessions/sudo_modal">

  

    


  

  

  

    <meta name="google-site-verification" content="c1kuD-K2HIVF635lypcsWPoD4kilo5-jA_wBFyT4uMY">
  <meta name="google-site-verification" content="KT5gs8h0wvaagLKAVWq8bbeNwnZZK1r1XQysX3xurLU">
  <meta name="google-site-verification" content="ZzhVyEFwb7w3e0-uOTltm8Jsck2F5StVihD0exw2fsA">
  <meta name="google-site-verification" content="GXs5KoUUkNCoaAZn7wPN-t01Pywp9M3sEjnt_3_ZWPc">

  <meta name="octolytics-host" content="collector.githubapp.com"><meta name="octolytics-app-id" content="github"><meta name="octolytics-event-url" content="https://collector.githubapp.com/github-external/browser_event"><meta name="octolytics-actor-id" content="68151137"><meta name="octolytics-actor-login" content="Puneeth-Aacharya"><meta name="octolytics-actor-hash" content="715316a427ad95646c2165afcdd556d3b15b7e8d55830df08a0ce2db946cee9f">

  

  



  <meta name="optimizely-datafile" content="{&quot;version&quot;: &quot;4&quot;, &quot;rollouts&quot;: [], &quot;typedAudiences&quot;: [], &quot;anonymizeIP&quot;: true, &quot;projectId&quot;: &quot;16737760170&quot;, &quot;variables&quot;: [], &quot;featureFlags&quot;: [], &quot;experiments&quot;: [{&quot;status&quot;: &quot;Running&quot;, &quot;audienceIds&quot;: [], &quot;variations&quot;: [{&quot;variables&quot;: [], &quot;id&quot;: &quot;20106410318&quot;, &quot;key&quot;: &quot;en&quot;}, {&quot;variables&quot;: [], &quot;id&quot;: &quot;20122000362&quot;, &quot;key&quot;: &quot;ko&quot;}], &quot;id&quot;: &quot;20121990335&quot;, &quot;key&quot;: &quot;ko_homepage_translation&quot;, &quot;layerId&quot;: &quot;20100420349&quot;, &quot;trafficAllocation&quot;: [{&quot;entityId&quot;: &quot;20106410318&quot;, &quot;endOfRange&quot;: 5000}, {&quot;entityId&quot;: &quot;20122000362&quot;, &quot;endOfRange&quot;: 10000}], &quot;forcedVariations&quot;: {}}, {&quot;status&quot;: &quot;Running&quot;, &quot;audienceIds&quot;: [], &quot;variations&quot;: [{&quot;variables&quot;: [], &quot;id&quot;: &quot;20236992340&quot;, &quot;key&quot;: &quot;usd&quot;}, {&quot;variables&quot;: [], &quot;id&quot;: &quot;20184442182&quot;, &quot;key&quot;: &quot;localized_currency&quot;}], &quot;id&quot;: &quot;20233233507&quot;, &quot;key&quot;: &quot;local_currency_pricing&quot;, &quot;layerId&quot;: &quot;20212472765&quot;, &quot;trafficAllocation&quot;: [{&quot;entityId&quot;: &quot;20184442182&quot;, &quot;endOfRange&quot;: 5000}, {&quot;entityId&quot;: &quot;20236992340&quot;, &quot;endOfRange&quot;: 10000}], &quot;forcedVariations&quot;: {&quot;667685045.1617740930&quot;: &quot;localized_currency&quot;}}], &quot;audiences&quot;: [{&quot;conditions&quot;: &quot;[\&quot;or\&quot;, {\&quot;match\&quot;: \&quot;exact\&quot;, \&quot;name\&quot;: \&quot;$opt_dummy_attribute\&quot;, \&quot;type\&quot;: \&quot;custom_attribute\&quot;, \&quot;value\&quot;: \&quot;$opt_dummy_value\&quot;}]&quot;, &quot;id&quot;: &quot;$opt_dummy_audience&quot;, &quot;name&quot;: &quot;Optimizely-Generated Audience for Backwards Compatibility&quot;}], &quot;groups&quot;: [], &quot;attributes&quot;: [{&quot;id&quot;: &quot;16822470375&quot;, &quot;key&quot;: &quot;user_id&quot;}, {&quot;id&quot;: &quot;17143601254&quot;, &quot;key&quot;: &quot;spammy&quot;}, {&quot;id&quot;: &quot;18175660309&quot;, &quot;key&quot;: &quot;organization_plan&quot;}, {&quot;id&quot;: &quot;18813001570&quot;, &quot;key&quot;: &quot;is_logged_in&quot;}, {&quot;id&quot;: &quot;19073851829&quot;, &quot;key&quot;: &quot;geo&quot;}, {&quot;id&quot;: &quot;20175462351&quot;, &quot;key&quot;: &quot;requestedCurrency&quot;}], &quot;botFiltering&quot;: false, &quot;accountId&quot;: &quot;16737760170&quot;, &quot;events&quot;: [{&quot;experimentIds&quot;: [], &quot;id&quot;: &quot;17911811441&quot;, &quot;key&quot;: &quot;hydro_click.dashboard.teacher_toolbox_cta&quot;}, {&quot;experimentIds&quot;: [], &quot;id&quot;: &quot;18124116703&quot;, &quot;key&quot;: &quot;submit.organizations.complete_sign_up&quot;}, {&quot;experimentIds&quot;: [], &quot;id&quot;: &quot;18145892387&quot;, &quot;key&quot;: &quot;no_metric.tracked_outside_of_optimizely&quot;}, {&quot;experimentIds&quot;: [], &quot;id&quot;: &quot;18178755568&quot;, &quot;key&quot;: &quot;click.org_onboarding_checklist.add_repo&quot;}, {&quot;experimentIds&quot;: [], &quot;id&quot;: &quot;18180553241&quot;, &quot;key&quot;: &quot;submit.repository_imports.create&quot;}, {&quot;experimentIds&quot;: [], &quot;id&quot;: &quot;18186103728&quot;, &quot;key&quot;: &quot;click.help.learn_more_about_repository_creation&quot;}, {&quot;experimentIds&quot;: [], &quot;id&quot;: &quot;18188530140&quot;, &quot;key&quot;: &quot;test_event.do_not_use_in_production&quot;}, {&quot;experimentIds&quot;: [], &quot;id&quot;: &quot;18191963644&quot;, &quot;key&quot;: &quot;click.empty_org_repo_cta.transfer_repository&quot;}, {&quot;experimentIds&quot;: [], &quot;id&quot;: &quot;18195612788&quot;, &quot;key&quot;: &quot;click.empty_org_repo_cta.import_repository&quot;}, {&quot;experimentIds&quot;: [], &quot;id&quot;: &quot;18210945499&quot;, &quot;key&quot;: &quot;click.org_onboarding_checklist.invite_members&quot;}, {&quot;experimentIds&quot;: [], &quot;id&quot;: &quot;18211063248&quot;, &quot;key&quot;: &quot;click.empty_org_repo_cta.create_repository&quot;}, {&quot;experimentIds&quot;: [], &quot;id&quot;: &quot;18215721889&quot;, &quot;key&quot;: &quot;click.org_onboarding_checklist.update_profile&quot;}, {&quot;experimentIds&quot;: [], &quot;id&quot;: &quot;18224360785&quot;, &quot;key&quot;: &quot;click.org_onboarding_checklist.dismiss&quot;}, {&quot;experimentIds&quot;: [], &quot;id&quot;: &quot;18234832286&quot;, &quot;key&quot;: &quot;submit.organization_activation.complete&quot;}, {&quot;experimentIds&quot;: [], &quot;id&quot;: &quot;18252392383&quot;, &quot;key&quot;: &quot;submit.org_repository.create&quot;}, {&quot;experimentIds&quot;: [], &quot;id&quot;: &quot;18257551537&quot;, &quot;key&quot;: &quot;submit.org_member_invitation.create&quot;}, {&quot;experimentIds&quot;: [], &quot;id&quot;: &quot;18259522260&quot;, &quot;key&quot;: &quot;submit.organization_profile.update&quot;}, {&quot;experimentIds&quot;: [], &quot;id&quot;: &quot;18564603625&quot;, &quot;key&quot;: &quot;view.classroom_select_organization&quot;}, {&quot;experimentIds&quot;: [], &quot;id&quot;: &quot;18568612016&quot;, &quot;key&quot;: &quot;click.classroom_sign_in_click&quot;}, {&quot;experimentIds&quot;: [], &quot;id&quot;: &quot;18572592540&quot;, &quot;key&quot;: &quot;view.classroom_name&quot;}, {&quot;experimentIds&quot;: [], &quot;id&quot;: &quot;18574203855&quot;, &quot;key&quot;: &quot;click.classroom_create_organization&quot;}, {&quot;experimentIds&quot;: [], &quot;id&quot;: &quot;18582053415&quot;, &quot;key&quot;: &quot;click.classroom_select_organization&quot;}, {&quot;experimentIds&quot;: [], &quot;id&quot;: &quot;18589463420&quot;, &quot;key&quot;: &quot;click.classroom_create_classroom&quot;}, {&quot;experimentIds&quot;: [], &quot;id&quot;: &quot;18591323364&quot;, &quot;key&quot;: &quot;click.classroom_create_first_classroom&quot;}, {&quot;experimentIds&quot;: [], &quot;id&quot;: &quot;18591652321&quot;, &quot;key&quot;: &quot;click.classroom_grant_access&quot;}, {&quot;experimentIds&quot;: [], &quot;id&quot;: &quot;18607131425&quot;, &quot;key&quot;: &quot;view.classroom_creation&quot;}, {&quot;experimentIds&quot;: [], &quot;id&quot;: &quot;18831680583&quot;, &quot;key&quot;: &quot;upgrade_account_plan&quot;}, {&quot;experimentIds&quot;: [], &quot;id&quot;: &quot;19064064515&quot;, &quot;key&quot;: &quot;click.signup&quot;}, {&quot;experimentIds&quot;: [], &quot;id&quot;: &quot;19075373687&quot;, &quot;key&quot;: &quot;click.view_account_billing_page&quot;}, {&quot;experimentIds&quot;: [], &quot;id&quot;: &quot;19077355841&quot;, &quot;key&quot;: &quot;click.dismiss_signup_prompt&quot;}, {&quot;experimentIds&quot;: [], &quot;id&quot;: &quot;19079713938&quot;, &quot;key&quot;: &quot;click.contact_sales&quot;}, {&quot;experimentIds&quot;: [], &quot;id&quot;: &quot;19120963070&quot;, &quot;key&quot;: &quot;click.compare_account_plans&quot;}, {&quot;experimentIds&quot;: [&quot;20233233507&quot;], &quot;id&quot;: &quot;19151690317&quot;, &quot;key&quot;: &quot;click.upgrade_account_cta&quot;}, {&quot;experimentIds&quot;: [], &quot;id&quot;: &quot;19424193129&quot;, &quot;key&quot;: &quot;click.open_account_switcher&quot;}, {&quot;experimentIds&quot;: [], &quot;id&quot;: &quot;19520330825&quot;, &quot;key&quot;: &quot;click.visit_account_profile&quot;}, {&quot;experimentIds&quot;: [], &quot;id&quot;: &quot;19540970635&quot;, &quot;key&quot;: &quot;click.switch_account_context&quot;}, {&quot;experimentIds&quot;: [&quot;20121990335&quot;], &quot;id&quot;: &quot;19730198868&quot;, &quot;key&quot;: &quot;submit.homepage_signup&quot;}, {&quot;experimentIds&quot;: [&quot;20121990335&quot;], &quot;id&quot;: &quot;19820830627&quot;, &quot;key&quot;: &quot;click.homepage_signup&quot;}, {&quot;experimentIds&quot;: [], &quot;id&quot;: &quot;19988571001&quot;, &quot;key&quot;: &quot;click.create_enterprise_trial&quot;}, {&quot;experimentIds&quot;: [&quot;20233233507&quot;], &quot;id&quot;: &quot;20036538294&quot;, &quot;key&quot;: &quot;click.create_organization_team&quot;}, {&quot;experimentIds&quot;: [], &quot;id&quot;: &quot;20040653299&quot;, &quot;key&quot;: &quot;click.input_enterprise_trial_form&quot;}, {&quot;experimentIds&quot;: [&quot;20233233507&quot;], &quot;id&quot;: &quot;20062030003&quot;, &quot;key&quot;: &quot;click.continue_with_team&quot;}, {&quot;experimentIds&quot;: [], &quot;id&quot;: &quot;20068947153&quot;, &quot;key&quot;: &quot;click.create_organization_free&quot;}, {&quot;experimentIds&quot;: [], &quot;id&quot;: &quot;20086636658&quot;, &quot;key&quot;: &quot;click.signup_continue.username&quot;}, {&quot;experimentIds&quot;: [], &quot;id&quot;: &quot;20091648988&quot;, &quot;key&quot;: &quot;click.signup_continue.create_account&quot;}, {&quot;experimentIds&quot;: [], &quot;id&quot;: &quot;20103637615&quot;, &quot;key&quot;: &quot;click.signup_continue.email&quot;}, {&quot;experimentIds&quot;: [], &quot;id&quot;: &quot;20111574253&quot;, &quot;key&quot;: &quot;click.signup_continue.password&quot;}, {&quot;experimentIds&quot;: [&quot;20233233507&quot;], &quot;id&quot;: &quot;20120044111&quot;, &quot;key&quot;: &quot;view.pricing_page&quot;}, {&quot;experimentIds&quot;: [&quot;20121990335&quot;, &quot;20233233507&quot;], &quot;id&quot;: &quot;20152062109&quot;, &quot;key&quot;: &quot;submit.create_account&quot;}, {&quot;experimentIds&quot;: [&quot;20233233507&quot;], &quot;id&quot;: &quot;20165800992&quot;, &quot;key&quot;: &quot;submit.upgrade_payment_form&quot;}, {&quot;experimentIds&quot;: [&quot;20233233507&quot;], &quot;id&quot;: &quot;20171520319&quot;, &quot;key&quot;: &quot;submit.create_organization&quot;}, {&quot;experimentIds&quot;: [], &quot;id&quot;: &quot;20227443657&quot;, &quot;key&quot;: &quot;submit.verify_primary_user_email&quot;}], &quot;revision&quot;: &quot;661&quot;}">
  <!-- To prevent page flashing, the optimizely JS needs to be loaded in the
    <head> tag before the DOM renders -->
  <script data-dapp-detection="">!function(){let e=!1;function n(){if(!e){const n=document.createElement("meta");n.name="dapp-detected",document.head.appendChild(n),e=!0}}if(window.hasOwnProperty("ethereum")){if(window.__disableDappDetectionInsertion=!0,void 0===window.ethereum)return;n()}else{var t=window.ethereum;Object.defineProperty(window,"ethereum",{configurable:!0,enumerable:!1,set:function(e){window.__disableDappDetectionInsertion||n(),t=e},get:function(){if(!window.__disableDappDetectionInsertion){const e=arguments.callee;e&&e.caller&&e.caller.toString&&-1!==e.caller.toString().indexOf("getOwnPropertyNames")||n()}return t}})}}();</script><script crossorigin="anonymous" defer="defer" integrity="sha512-8UY3CBW7Xje5nz/CEt6p1vX2b3SFA5sYmz+iJiLaw+854bhhPZhurJkCeStg6J84nwNwSVHG3WNAYCgrJy/qbg==" type="application/javascript" src="./DBMS_QUERIES_files/optimizely-f1463708.js.download"></script>



  

      <meta name="hostname" content="github.com">
    <meta name="user-login" content="Puneeth-Aacharya">


      <meta name="expected-hostname" content="github.com">

      <meta name="js-proxy-site-detection-payload" content="ZjNiOTY3YmYzN2VlMGM1ZTk4NTU0ZDA0NTk0MWEwOTlhY2ZkOTk1NWMzYjJhMTAyN2VkZDRlMGNmNjczOTcyMXx7InJlbW90ZV9hZGRyZXNzIjoiMjIzLjIzNy4xNzAuOTMiLCJyZXF1ZXN0X2lkIjoiOEE0Qzo2NTI2OjY4M0JFNDo4NDhBNzM6NjA5QTExMzgiLCJ0aW1lc3RhbXAiOjE2MjA3MDk3MDEsImhvc3QiOiJnaXRodWIuY29tIn0=">

    <meta name="enabled-features" content="MARKETPLACE_PENDING_INSTALLATIONS,AUTOCOMPLETE_EMOJIS_IN_MARKDOWN_EDITOR,GITHUB_TOKEN_PERMISSION,ACTIONS_CONCURRENCY_UI">

  <meta http-equiv="x-pjax-version" content="427b4f1fd73b2116c0d5dd8ff230afb39a56605280e07ed0efb0e8987d6b7376">
  

    
  <meta name="go-import" content="github.com/Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM git https://github.com/Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM.git">

  <meta name="octolytics-dimension-user_id" content="68151137"><meta name="octolytics-dimension-user_login" content="Puneeth-Aacharya"><meta name="octolytics-dimension-repository_id" content="335827863"><meta name="octolytics-dimension-repository_nwo" content="Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM"><meta name="octolytics-dimension-repository_public" content="true"><meta name="octolytics-dimension-repository_is_fork" content="false"><meta name="octolytics-dimension-repository_network_root_id" content="335827863"><meta name="octolytics-dimension-repository_network_root_nwo" content="Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM">



    


  <meta name="browser-stats-url" content="https://api.github.com/_private/browser/stats">

  <meta name="browser-errors-url" content="https://api.github.com/_private/browser/errors">

  <meta name="browser-optimizely-client-errors-url" content="https://api.github.com/_private/browser/optimizely_client/errors">

  <link rel="mask-icon" href="https://github.githubassets.com/pinned-octocat.svg" color="#000000">
  <link rel="alternate icon" class="js-site-favicon" type="image/png" href="https://github.githubassets.com/favicons/favicon-dark.png">
  <link rel="icon" class="js-site-favicon" type="image/svg+xml" href="https://github.githubassets.com/favicons/favicon-dark.svg">

<meta name="theme-color" content="#1e2327">
<meta name="color-scheme" content="dark light">


  <link rel="manifest" href="https://github.com/manifest.json" crossorigin="use-credentials">

<meta name="enabled-homepage-translation-languages" content="ko">

  <script type="application/javascript" src="./DBMS_QUERIES_files/codespaces-2823de38.js.download"></script><script type="application/javascript" src="./DBMS_QUERIES_files/topic-suggestions-55d0e74f.js.download"></script><meta name="selected-link" value="repo_source" data-pjax-transient=""><meta name="analytics-location" content="/&lt;user-name&gt;/&lt;repo-name&gt;/blob/show" data-pjax-transient=""><meta name="request-id" content="8A4C:6526:685305:84A5A7:609A11DA" data-pjax-transient=""><meta name="html-safe-nonce" content="cab8e680d6e1f1d66d03308b56346777e4c92ac7563004ad9de2755d90b22764" data-pjax-transient=""><meta name="visitor-payload" content="eyJyZWZlcnJlciI6Imh0dHBzOi8vZ2l0aHViLmNvbS9QdW5lZXRoLUFhY2hhcnlhL0hPU1BJVEFMLU1BTkFHRU1FTlQtU1lTVEVNL2Jsb2IvbWFpbi9EQk1TX1FVRVJJRVMuc3FsIiwicmVxdWVzdF9pZCI6IjhBNEM6NjUyNjo2ODUzMDU6ODRBNUE3OjYwOUExMURBIiwidmlzaXRvcl9pZCI6Ijg5MDE2MTE0MDgzOTAwNTI4MiIsInJlZ2lvbl9lZGdlIjoiYXAtc291dGgtMSIsInJlZ2lvbl9yZW5kZXIiOiJpYWQifQ==" data-pjax-transient=""><meta name="visitor-hmac" content="bb84b444c23aeee490c7110c47e8a65125dc7c334b6d03e7694f31502a23c38c" data-pjax-transient=""><meta name="github-keyboard-shortcuts" content="repository,source-code" data-pjax-transient=""><meta name="hovercard-subject-tag" content="repository:335827863" data-pjax-transient=""><link rel="canonical" href="https://github.com/Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM/blob/main/DBMS_QUERIES.sql" data-pjax-transient=""></head>

  <body class="logged-in env-production page-responsive page-blob intent-mouse" style="word-wrap: break-word;">
    

    <div class="position-relative js-header-wrapper ">
      <a href="https://github.com/Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM/blob/main/DBMS_QUERIES.sql#start-of-content" class="p-3 color-bg-info-inverse color-text-white show-on-focus js-skip-to-content">Skip to content</a>
      <span class="progress-pjax-loader width-full js-pjax-loader-bar Progress position-fixed">
    <span style="background-color: rgb(121, 184, 255); width: 100%; transition: width 0.4s ease 0s;" class="Progress-item progress-pjax-loader-bar "></span>
</span>      
      


            <header class="Header js-details-container Details px-3 px-md-4 px-lg-5 flex-wrap flex-md-nowrap" role="banner">
    <div class="Header-item mt-n1 mb-n1  d-none d-md-flex">
      <a class="Header-link " href="https://github.com/" data-hotkey="g d" aria-label="Homepage " data-ga-click="Header, go to dashboard, icon:logo">
  <svg class="octicon octicon-mark-github v-align-middle" height="32" viewBox="0 0 16 16" version="1.1" width="32" aria-hidden="true"><path fill-rule="evenodd" d="M8 0C3.58 0 0 3.58 0 8c0 3.54 2.29 6.53 5.47 7.59.4.07.55-.17.55-.38 0-.19-.01-.82-.01-1.49-2.01.37-2.53-.49-2.69-.94-.09-.23-.48-.94-.82-1.13-.28-.15-.68-.52-.01-.53.63-.01 1.08.58 1.23.82.72 1.21 1.87.87 2.33.66.07-.52.28-.87.51-1.07-1.78-.2-3.64-.89-3.64-3.95 0-.87.31-1.59.82-2.15-.08-.2-.36-1.02.08-2.12 0 0 .67-.21 2.2.82.64-.18 1.32-.27 2-.27.68 0 1.36.09 2 .27 1.53-1.04 2.2-.82 2.2-.82.44 1.1.16 1.92.08 2.12.51.56.82 1.27.82 2.15 0 3.07-1.87 3.75-3.65 3.95.29.25.54.73.54 1.48 0 1.07-.01 1.93-.01 2.2 0 .21.15.46.55.38A8.013 8.013 0 0016 8c0-4.42-3.58-8-8-8z"></path></svg>
</a>

    </div>

    <div class="Header-item d-md-none">
      <button class="Header-link btn-link js-details-target" type="button" aria-label="Toggle navigation" aria-expanded="false">
        <svg height="24" class="octicon octicon-three-bars" viewBox="0 0 16 16" version="1.1" width="24" aria-hidden="true"><path fill-rule="evenodd" d="M1 2.75A.75.75 0 011.75 2h12.5a.75.75 0 110 1.5H1.75A.75.75 0 011 2.75zm0 5A.75.75 0 011.75 7h12.5a.75.75 0 110 1.5H1.75A.75.75 0 011 7.75zM1.75 12a.75.75 0 100 1.5h12.5a.75.75 0 100-1.5H1.75z"></path></svg>
      </button>
    </div>

    <div class="Header-item Header-item--full flex-column flex-md-row width-full flex-order-2 flex-md-order-none mr-0 mr-md-3 mt-3 mt-md-0 Details-content--hidden-not-important d-md-flex">
          <div class="header-search flex-auto js-site-search position-relative flex-self-stretch flex-md-self-auto mb-3 mb-md-0 mr-0 mr-md-3 scoped-search site-scoped-search js-jump-to" role="combobox" aria-owns="jump-to-results" aria-label="Search or jump to" aria-haspopup="listbox" aria-expanded="false">
  <div class="position-relative">
    <!-- '"` --><!-- </textarea></xmp> --><form class="js-site-search-form" role="search" aria-label="Site" data-scope-type="Repository" data-scope-id="335827863" data-scoped-search-url="/Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM/search" data-owner-scoped-search-url="/users/Puneeth-Aacharya/search" data-unscoped-search-url="/search" action="https://github.com/Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM/search" accept-charset="UTF-8" method="get">
      <label class="form-control input-sm header-search-wrapper p-0 js-chromeless-input-container header-search-wrapper-jump-to position-relative d-flex flex-justify-between flex-items-center">
        <input type="text" class="form-control input-sm header-search-input jump-to-field js-jump-to-field js-site-search-focus js-site-search-field is-clearable" data-hotkey="s,/" name="q" value="" placeholder="Search or jump to…" data-unscoped-placeholder="Search or jump to…" data-scoped-placeholder="Search or jump to…" autocapitalize="off" aria-autocomplete="list" aria-controls="jump-to-results" aria-label="Search or jump to…" data-jump-to-suggestions-path="/_graphql/GetSuggestedNavigationDestinations" spellcheck="false" autocomplete="off">
          <input type="hidden" value="JNkfZu+/KxBbtvhNuLqYL6Jz5aI45r1JdfRZRxdNXJP8Oa47STniGYOxVVGjfS53DI0hpIrWhaJuUmYiz0E39Q==" data-csrf="true" class="js-data-jump-to-suggestions-path-csrf">
          <input type="hidden" class="js-site-search-type-field" name="type">
            <img src="./DBMS_QUERIES_files/search-key-slash.svg" alt="" class="mr-2 header-search-key-slash">

            <div class="Box position-absolute overflow-hidden d-none jump-to-suggestions js-jump-to-suggestions-container">
              
<ul class="d-none js-jump-to-suggestions-template-container">
  

<li class="d-flex flex-justify-start flex-items-center p-0 f5 navigation-item js-navigation-item js-jump-to-suggestion" role="option">
  <a tabindex="-1" class="no-underline d-flex flex-auto flex-items-center jump-to-suggestions-path js-jump-to-suggestion-path js-navigation-open p-2" href="https://github.com/Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM/blob/main/DBMS_QUERIES.sql" data-item-type="suggestion">
    <div class="jump-to-octicon js-jump-to-octicon flex-shrink-0 mr-2 text-center d-none">
      <svg height="16" width="16" class="octicon octicon-repo flex-shrink-0 js-jump-to-octicon-repo d-none" title="Repository" aria-label="Repository" viewBox="0 0 16 16" version="1.1" role="img"><path fill-rule="evenodd" d="M2 2.5A2.5 2.5 0 014.5 0h8.75a.75.75 0 01.75.75v12.5a.75.75 0 01-.75.75h-2.5a.75.75 0 110-1.5h1.75v-2h-8a1 1 0 00-.714 1.7.75.75 0 01-1.072 1.05A2.495 2.495 0 012 11.5v-9zm10.5-1V9h-8c-.356 0-.694.074-1 .208V2.5a1 1 0 011-1h8zM5 12.25v3.25a.25.25 0 00.4.2l1.45-1.087a.25.25 0 01.3 0L8.6 15.7a.25.25 0 00.4-.2v-3.25a.25.25 0 00-.25-.25h-3.5a.25.25 0 00-.25.25z"></path></svg>
      <svg height="16" width="16" class="octicon octicon-project flex-shrink-0 js-jump-to-octicon-project d-none" title="Project" aria-label="Project" viewBox="0 0 16 16" version="1.1" role="img"><path fill-rule="evenodd" d="M1.75 0A1.75 1.75 0 000 1.75v12.5C0 15.216.784 16 1.75 16h12.5A1.75 1.75 0 0016 14.25V1.75A1.75 1.75 0 0014.25 0H1.75zM1.5 1.75a.25.25 0 01.25-.25h12.5a.25.25 0 01.25.25v12.5a.25.25 0 01-.25.25H1.75a.25.25 0 01-.25-.25V1.75zM11.75 3a.75.75 0 00-.75.75v7.5a.75.75 0 001.5 0v-7.5a.75.75 0 00-.75-.75zm-8.25.75a.75.75 0 011.5 0v5.5a.75.75 0 01-1.5 0v-5.5zM8 3a.75.75 0 00-.75.75v3.5a.75.75 0 001.5 0v-3.5A.75.75 0 008 3z"></path></svg>
      <svg height="16" width="16" class="octicon octicon-search flex-shrink-0 js-jump-to-octicon-search d-none" title="Search" aria-label="Search" viewBox="0 0 16 16" version="1.1" role="img"><path fill-rule="evenodd" d="M11.5 7a4.499 4.499 0 11-8.998 0A4.499 4.499 0 0111.5 7zm-.82 4.74a6 6 0 111.06-1.06l3.04 3.04a.75.75 0 11-1.06 1.06l-3.04-3.04z"></path></svg>
    </div>

    <img class="avatar mr-2 flex-shrink-0 js-jump-to-suggestion-avatar d-none" alt="" aria-label="Team" src="https://github.com/Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM/blob/main/DBMS_QUERIES.sql" width="28" height="28">

    <div class="jump-to-suggestion-name js-jump-to-suggestion-name flex-auto overflow-hidden text-left no-wrap css-truncate css-truncate-target">
    </div>

    <div class="border rounded-1 flex-shrink-0 color-bg-tertiary px-1 color-text-tertiary ml-1 f6 d-none js-jump-to-badge-search">
      <span class="js-jump-to-badge-search-text-default d-none" aria-label="in this repository">
        In this repository
      </span>
      <span class="js-jump-to-badge-search-text-global d-none" aria-label="in all of GitHub">
        All GitHub
      </span>
      <span aria-hidden="true" class="d-inline-block ml-1 v-align-middle">↵</span>
    </div>

    <div aria-hidden="true" class="border rounded-1 flex-shrink-0 color-bg-tertiary px-1 color-text-tertiary ml-1 f6 d-none d-on-nav-focus js-jump-to-badge-jump">
      Jump to
      <span class="d-inline-block ml-1 v-align-middle">↵</span>
    </div>
  </a>
</li>

</ul>

<ul class="d-none js-jump-to-no-results-template-container">
  <li class="d-flex flex-justify-center flex-items-center f5 d-none js-jump-to-suggestion p-2">
    <span class="color-text-secondary">No suggested jump to results</span>
  </li>
</ul>

<ul id="jump-to-results" role="listbox" class="p-0 m-0 js-navigation-container jump-to-suggestions-results-container js-jump-to-suggestions-results-container">
  

<li class="d-flex flex-justify-start flex-items-center p-0 f5 navigation-item js-navigation-item js-jump-to-scoped-search d-none" role="option">
  <a tabindex="-1" class="no-underline d-flex flex-auto flex-items-center jump-to-suggestions-path js-jump-to-suggestion-path js-navigation-open p-2" href="https://github.com/Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM/blob/main/DBMS_QUERIES.sql" data-item-type="scoped_search">
    <div class="jump-to-octicon js-jump-to-octicon flex-shrink-0 mr-2 text-center d-none">
      <svg height="16" width="16" class="octicon octicon-repo flex-shrink-0 js-jump-to-octicon-repo d-none" title="Repository" aria-label="Repository" viewBox="0 0 16 16" version="1.1" role="img"><path fill-rule="evenodd" d="M2 2.5A2.5 2.5 0 014.5 0h8.75a.75.75 0 01.75.75v12.5a.75.75 0 01-.75.75h-2.5a.75.75 0 110-1.5h1.75v-2h-8a1 1 0 00-.714 1.7.75.75 0 01-1.072 1.05A2.495 2.495 0 012 11.5v-9zm10.5-1V9h-8c-.356 0-.694.074-1 .208V2.5a1 1 0 011-1h8zM5 12.25v3.25a.25.25 0 00.4.2l1.45-1.087a.25.25 0 01.3 0L8.6 15.7a.25.25 0 00.4-.2v-3.25a.25.25 0 00-.25-.25h-3.5a.25.25 0 00-.25.25z"></path></svg>
      <svg height="16" width="16" class="octicon octicon-project flex-shrink-0 js-jump-to-octicon-project d-none" title="Project" aria-label="Project" viewBox="0 0 16 16" version="1.1" role="img"><path fill-rule="evenodd" d="M1.75 0A1.75 1.75 0 000 1.75v12.5C0 15.216.784 16 1.75 16h12.5A1.75 1.75 0 0016 14.25V1.75A1.75 1.75 0 0014.25 0H1.75zM1.5 1.75a.25.25 0 01.25-.25h12.5a.25.25 0 01.25.25v12.5a.25.25 0 01-.25.25H1.75a.25.25 0 01-.25-.25V1.75zM11.75 3a.75.75 0 00-.75.75v7.5a.75.75 0 001.5 0v-7.5a.75.75 0 00-.75-.75zm-8.25.75a.75.75 0 011.5 0v5.5a.75.75 0 01-1.5 0v-5.5zM8 3a.75.75 0 00-.75.75v3.5a.75.75 0 001.5 0v-3.5A.75.75 0 008 3z"></path></svg>
      <svg height="16" width="16" class="octicon octicon-search flex-shrink-0 js-jump-to-octicon-search d-none" title="Search" aria-label="Search" viewBox="0 0 16 16" version="1.1" role="img"><path fill-rule="evenodd" d="M11.5 7a4.499 4.499 0 11-8.998 0A4.499 4.499 0 0111.5 7zm-.82 4.74a6 6 0 111.06-1.06l3.04 3.04a.75.75 0 11-1.06 1.06l-3.04-3.04z"></path></svg>
    </div>

    <img class="avatar mr-2 flex-shrink-0 js-jump-to-suggestion-avatar d-none" alt="" aria-label="Team" src="https://github.com/Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM/blob/main/DBMS_QUERIES.sql" width="28" height="28">

    <div class="jump-to-suggestion-name js-jump-to-suggestion-name flex-auto overflow-hidden text-left no-wrap css-truncate css-truncate-target">
    </div>

    <div class="border rounded-1 flex-shrink-0 color-bg-tertiary px-1 color-text-tertiary ml-1 f6 d-none js-jump-to-badge-search">
      <span class="js-jump-to-badge-search-text-default d-none" aria-label="in this repository">
        In this repository
      </span>
      <span class="js-jump-to-badge-search-text-global d-none" aria-label="in all of GitHub">
        All GitHub
      </span>
      <span aria-hidden="true" class="d-inline-block ml-1 v-align-middle">↵</span>
    </div>

    <div aria-hidden="true" class="border rounded-1 flex-shrink-0 color-bg-tertiary px-1 color-text-tertiary ml-1 f6 d-none d-on-nav-focus js-jump-to-badge-jump">
      Jump to
      <span class="d-inline-block ml-1 v-align-middle">↵</span>
    </div>
  </a>
</li>

  

<li class="d-flex flex-justify-start flex-items-center p-0 f5 navigation-item js-navigation-item js-jump-to-owner-scoped-search d-none" role="option">
  <a tabindex="-1" class="no-underline d-flex flex-auto flex-items-center jump-to-suggestions-path js-jump-to-suggestion-path js-navigation-open p-2" href="https://github.com/Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM/blob/main/DBMS_QUERIES.sql" data-item-type="owner_scoped_search">
    <div class="jump-to-octicon js-jump-to-octicon flex-shrink-0 mr-2 text-center d-none">
      <svg height="16" width="16" class="octicon octicon-repo flex-shrink-0 js-jump-to-octicon-repo d-none" title="Repository" aria-label="Repository" viewBox="0 0 16 16" version="1.1" role="img"><path fill-rule="evenodd" d="M2 2.5A2.5 2.5 0 014.5 0h8.75a.75.75 0 01.75.75v12.5a.75.75 0 01-.75.75h-2.5a.75.75 0 110-1.5h1.75v-2h-8a1 1 0 00-.714 1.7.75.75 0 01-1.072 1.05A2.495 2.495 0 012 11.5v-9zm10.5-1V9h-8c-.356 0-.694.074-1 .208V2.5a1 1 0 011-1h8zM5 12.25v3.25a.25.25 0 00.4.2l1.45-1.087a.25.25 0 01.3 0L8.6 15.7a.25.25 0 00.4-.2v-3.25a.25.25 0 00-.25-.25h-3.5a.25.25 0 00-.25.25z"></path></svg>
      <svg height="16" width="16" class="octicon octicon-project flex-shrink-0 js-jump-to-octicon-project d-none" title="Project" aria-label="Project" viewBox="0 0 16 16" version="1.1" role="img"><path fill-rule="evenodd" d="M1.75 0A1.75 1.75 0 000 1.75v12.5C0 15.216.784 16 1.75 16h12.5A1.75 1.75 0 0016 14.25V1.75A1.75 1.75 0 0014.25 0H1.75zM1.5 1.75a.25.25 0 01.25-.25h12.5a.25.25 0 01.25.25v12.5a.25.25 0 01-.25.25H1.75a.25.25 0 01-.25-.25V1.75zM11.75 3a.75.75 0 00-.75.75v7.5a.75.75 0 001.5 0v-7.5a.75.75 0 00-.75-.75zm-8.25.75a.75.75 0 011.5 0v5.5a.75.75 0 01-1.5 0v-5.5zM8 3a.75.75 0 00-.75.75v3.5a.75.75 0 001.5 0v-3.5A.75.75 0 008 3z"></path></svg>
      <svg height="16" width="16" class="octicon octicon-search flex-shrink-0 js-jump-to-octicon-search d-none" title="Search" aria-label="Search" viewBox="0 0 16 16" version="1.1" role="img"><path fill-rule="evenodd" d="M11.5 7a4.499 4.499 0 11-8.998 0A4.499 4.499 0 0111.5 7zm-.82 4.74a6 6 0 111.06-1.06l3.04 3.04a.75.75 0 11-1.06 1.06l-3.04-3.04z"></path></svg>
    </div>

    <img class="avatar mr-2 flex-shrink-0 js-jump-to-suggestion-avatar d-none" alt="" aria-label="Team" src="https://github.com/Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM/blob/main/DBMS_QUERIES.sql" width="28" height="28">

    <div class="jump-to-suggestion-name js-jump-to-suggestion-name flex-auto overflow-hidden text-left no-wrap css-truncate css-truncate-target">
    </div>

    <div class="border rounded-1 flex-shrink-0 color-bg-tertiary px-1 color-text-tertiary ml-1 f6 d-none js-jump-to-badge-search">
      <span class="js-jump-to-badge-search-text-default d-none" aria-label="in this user">
        In this user
      </span>
      <span class="js-jump-to-badge-search-text-global d-none" aria-label="in all of GitHub">
        All GitHub
      </span>
      <span aria-hidden="true" class="d-inline-block ml-1 v-align-middle">↵</span>
    </div>

    <div aria-hidden="true" class="border rounded-1 flex-shrink-0 color-bg-tertiary px-1 color-text-tertiary ml-1 f6 d-none d-on-nav-focus js-jump-to-badge-jump">
      Jump to
      <span class="d-inline-block ml-1 v-align-middle">↵</span>
    </div>
  </a>
</li>

  

<li class="d-flex flex-justify-start flex-items-center p-0 f5 navigation-item js-navigation-item js-jump-to-global-search d-none" role="option">
  <a tabindex="-1" class="no-underline d-flex flex-auto flex-items-center jump-to-suggestions-path js-jump-to-suggestion-path js-navigation-open p-2" href="https://github.com/Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM/blob/main/DBMS_QUERIES.sql" data-item-type="global_search">
    <div class="jump-to-octicon js-jump-to-octicon flex-shrink-0 mr-2 text-center d-none">
      <svg height="16" width="16" class="octicon octicon-repo flex-shrink-0 js-jump-to-octicon-repo d-none" title="Repository" aria-label="Repository" viewBox="0 0 16 16" version="1.1" role="img"><path fill-rule="evenodd" d="M2 2.5A2.5 2.5 0 014.5 0h8.75a.75.75 0 01.75.75v12.5a.75.75 0 01-.75.75h-2.5a.75.75 0 110-1.5h1.75v-2h-8a1 1 0 00-.714 1.7.75.75 0 01-1.072 1.05A2.495 2.495 0 012 11.5v-9zm10.5-1V9h-8c-.356 0-.694.074-1 .208V2.5a1 1 0 011-1h8zM5 12.25v3.25a.25.25 0 00.4.2l1.45-1.087a.25.25 0 01.3 0L8.6 15.7a.25.25 0 00.4-.2v-3.25a.25.25 0 00-.25-.25h-3.5a.25.25 0 00-.25.25z"></path></svg>
      <svg height="16" width="16" class="octicon octicon-project flex-shrink-0 js-jump-to-octicon-project d-none" title="Project" aria-label="Project" viewBox="0 0 16 16" version="1.1" role="img"><path fill-rule="evenodd" d="M1.75 0A1.75 1.75 0 000 1.75v12.5C0 15.216.784 16 1.75 16h12.5A1.75 1.75 0 0016 14.25V1.75A1.75 1.75 0 0014.25 0H1.75zM1.5 1.75a.25.25 0 01.25-.25h12.5a.25.25 0 01.25.25v12.5a.25.25 0 01-.25.25H1.75a.25.25 0 01-.25-.25V1.75zM11.75 3a.75.75 0 00-.75.75v7.5a.75.75 0 001.5 0v-7.5a.75.75 0 00-.75-.75zm-8.25.75a.75.75 0 011.5 0v5.5a.75.75 0 01-1.5 0v-5.5zM8 3a.75.75 0 00-.75.75v3.5a.75.75 0 001.5 0v-3.5A.75.75 0 008 3z"></path></svg>
      <svg height="16" width="16" class="octicon octicon-search flex-shrink-0 js-jump-to-octicon-search d-none" title="Search" aria-label="Search" viewBox="0 0 16 16" version="1.1" role="img"><path fill-rule="evenodd" d="M11.5 7a4.499 4.499 0 11-8.998 0A4.499 4.499 0 0111.5 7zm-.82 4.74a6 6 0 111.06-1.06l3.04 3.04a.75.75 0 11-1.06 1.06l-3.04-3.04z"></path></svg>
    </div>

    <img class="avatar mr-2 flex-shrink-0 js-jump-to-suggestion-avatar d-none" alt="" aria-label="Team" src="https://github.com/Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM/blob/main/DBMS_QUERIES.sql" width="28" height="28">

    <div class="jump-to-suggestion-name js-jump-to-suggestion-name flex-auto overflow-hidden text-left no-wrap css-truncate css-truncate-target">
    </div>

    <div class="border rounded-1 flex-shrink-0 color-bg-tertiary px-1 color-text-tertiary ml-1 f6 d-none js-jump-to-badge-search">
      <span class="js-jump-to-badge-search-text-default d-none" aria-label="in this repository">
        In this repository
      </span>
      <span class="js-jump-to-badge-search-text-global d-none" aria-label="in all of GitHub">
        All GitHub
      </span>
      <span aria-hidden="true" class="d-inline-block ml-1 v-align-middle">↵</span>
    </div>

    <div aria-hidden="true" class="border rounded-1 flex-shrink-0 color-bg-tertiary px-1 color-text-tertiary ml-1 f6 d-none d-on-nav-focus js-jump-to-badge-jump">
      Jump to
      <span class="d-inline-block ml-1 v-align-middle">↵</span>
    </div>
  </a>
</li>


    <li class="d-flex flex-justify-center flex-items-center p-0 f5 js-jump-to-suggestion">
      <svg style="box-sizing: content-box; color: var(--color-icon-primary);" viewBox="0 0 16 16" fill="none" width="32" height="32" class="m-3 anim-rotate">
  <circle cx="8" cy="8" r="7" stroke="currentColor" stroke-opacity="0.25" stroke-width="2" vector-effect="non-scaling-stroke"></circle>
  <path d="M15 8a7.002 7.002 0 00-7-7" stroke="currentColor" stroke-width="2" stroke-linecap="round" vector-effect="non-scaling-stroke"></path>
</svg>
    </li>
</ul>

            </div>
      </label>
</form>  </div>
</div>

        <nav class="d-flex flex-column flex-md-row flex-self-stretch flex-md-self-auto" aria-label="Global">
      <a class="Header-link py-md-3 d-block d-md-none py-2 border-top border-md-top-0 border-white-fade-15" data-ga-click="Header, click, Nav menu - item:dashboard:user" aria-label="Dashboard" href="https://github.com/dashboard">
        Dashboard
</a>
    <a class="js-selected-navigation-item Header-link mt-md-n3 mb-md-n3 py-2 py-md-3 mr-0 mr-md-3 border-top border-md-top-0 border-white-fade-15" data-hotkey="g p" data-ga-click="Header, click, Nav menu - item:pulls context:user" aria-label="Pull requests you created" data-selected-links="/pulls /pulls/assigned /pulls/mentioned /pulls" href="https://github.com/pulls">
        Pull<span class="d-inline d-md-none d-lg-inline"> request</span>s
</a>
    <a class="js-selected-navigation-item Header-link mt-md-n3 mb-md-n3 py-2 py-md-3 mr-0 mr-md-3 border-top border-md-top-0 border-white-fade-15" data-hotkey="g i" data-ga-click="Header, click, Nav menu - item:issues context:user" aria-label="Issues you created" data-selected-links="/issues /issues/assigned /issues/mentioned /issues" href="https://github.com/issues">
      Issues
</a>
      <div class="d-flex position-relative">
        <a class="js-selected-navigation-item Header-link flex-auto mt-md-n3 mb-md-n3 py-2 py-md-3 mr-0 mr-md-3 border-top border-md-top-0 border-white-fade-15" data-ga-click="Header, click, Nav menu - item:marketplace context:user" data-octo-click="marketplace_click" data-octo-dimensions="location:nav_bar" data-selected-links=" /marketplace" href="https://github.com/marketplace">
          Marketplace
</a>      </div>

    <a class="js-selected-navigation-item Header-link mt-md-n3 mb-md-n3 py-2 py-md-3 mr-0 mr-md-3 border-top border-md-top-0 border-white-fade-15" data-ga-click="Header, click, Nav menu - item:explore" data-selected-links="/explore /trending /trending/developers /integrations /integrations/feature/code /integrations/feature/collaborate /integrations/feature/ship showcases showcases_search showcases_landing /explore" href="https://github.com/explore">
      Explore
</a>
    <a class="js-selected-navigation-item Header-link d-block d-md-none py-2 py-md-3 border-top border-md-top-0 border-white-fade-15" data-ga-click="Header, click, Nav menu - item:workspaces context:user" data-selected-links="/codespaces /codespaces" href="https://github.com/codespaces">
      Codespaces
</a>
      <a class="js-selected-navigation-item Header-link d-block d-md-none py-2 py-md-3 border-top border-md-top-0 border-white-fade-15" data-ga-click="Header, click, Nav menu - item:Sponsors" data-hydro-click="{&quot;event_type&quot;:&quot;sponsors.button_click&quot;,&quot;payload&quot;:{&quot;button&quot;:&quot;HEADER_SPONSORS_DASHBOARD&quot;,&quot;sponsorable_login&quot;:&quot;Puneeth-Aacharya&quot;,&quot;originating_url&quot;:&quot;https://github.com/Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM/blob/main/Admin%20Login%20page.png&quot;,&quot;user_id&quot;:68151137}}" data-hydro-click-hmac="ca78dc20572dbb19c267ee1b061c4d3fae32cce8b2193f4cd32f4a0575f5304e" data-selected-links=" /sponsors/accounts" href="https://github.com/sponsors/accounts">Sponsors</a>

    <a class="Header-link d-block d-md-none mr-0 mr-md-3 py-2 py-md-3 border-top border-md-top-0 border-white-fade-15" href="https://github.com/settings/profile">
      Settings
</a>
    <a class="Header-link d-block d-md-none mr-0 mr-md-3 py-2 py-md-3 border-top border-md-top-0 border-white-fade-15" href="https://github.com/Puneeth-Aacharya">
      <img class="avatar avatar-user" src="./DBMS_QUERIES_files/68151137" width="20" height="20" alt="@Puneeth-Aacharya">
      Puneeth-Aacharya
</a>
    <!-- '"` --><!-- </textarea></xmp> --><form action="https://github.com/logout" accept-charset="UTF-8" method="post"><input type="hidden" name="authenticity_token" value="dKkhUx8UNQ8gX2hwAtYr8qJLK7pE+Sa5ELSwrRiwWJ6mCsqcvB+RsTeLCjqfmzPMiOpjYTfPXJNhkyvYcl8bbg==">
      <button type="submit" class="Header-link mr-0 mr-md-3 py-2 py-md-3 border-top border-md-top-0 border-white-fade-15 d-md-none btn-link d-block width-full text-left" data-ga-click="Header, sign out, icon:logout" style="padding-left: 2px;">
        <svg class="octicon octicon-sign-out v-align-middle" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M2 2.75C2 1.784 2.784 1 3.75 1h2.5a.75.75 0 010 1.5h-2.5a.25.25 0 00-.25.25v10.5c0 .138.112.25.25.25h2.5a.75.75 0 010 1.5h-2.5A1.75 1.75 0 012 13.25V2.75zm10.44 4.5H6.75a.75.75 0 000 1.5h5.69l-1.97 1.97a.75.75 0 101.06 1.06l3.25-3.25a.75.75 0 000-1.06l-3.25-3.25a.75.75 0 10-1.06 1.06l1.97 1.97z"></path></svg>
        Sign out
      </button>
</form></nav>

    </div>

    <div class="Header-item Header-item--full flex-justify-center d-md-none position-relative">
        <a class="Header-link " href="https://github.com/" data-hotkey="g d" aria-label="Homepage " data-ga-click="Header, go to dashboard, icon:logo">
  <svg class="octicon octicon-mark-github v-align-middle" height="32" viewBox="0 0 16 16" version="1.1" width="32" aria-hidden="true"><path fill-rule="evenodd" d="M8 0C3.58 0 0 3.58 0 8c0 3.54 2.29 6.53 5.47 7.59.4.07.55-.17.55-.38 0-.19-.01-.82-.01-1.49-2.01.37-2.53-.49-2.69-.94-.09-.23-.48-.94-.82-1.13-.28-.15-.68-.52-.01-.53.63-.01 1.08.58 1.23.82.72 1.21 1.87.87 2.33.66.07-.52.28-.87.51-1.07-1.78-.2-3.64-.89-3.64-3.95 0-.87.31-1.59.82-2.15-.08-.2-.36-1.02.08-2.12 0 0 .67-.21 2.2.82.64-.18 1.32-.27 2-.27.68 0 1.36.09 2 .27 1.53-1.04 2.2-.82 2.2-.82.44 1.1.16 1.92.08 2.12.51.56.82 1.27.82 2.15 0 3.07-1.87 3.75-3.65 3.95.29.25.54.73.54 1.48 0 1.07-.01 1.93-.01 2.2 0 .21.15.46.55.38A8.013 8.013 0 0016 8c0-4.42-3.58-8-8-8z"></path></svg>
</a>

    </div>

    <div class="Header-item mr-0 mr-md-3 flex-order-1 flex-md-order-none">
        


      <notification-indicator class="js-socket-channel" data-test-selector="notifications-indicator" data-channel="eyJjIjoibm90aWZpY2F0aW9uLWNoYW5nZWQ6NjgxNTExMzciLCJ0IjoxNjIwNzA5NzAxfQ==--f060f8192f443663872bbb22a6d70174d62b21b1d6235def840e457c5dd843b9" data-catalyst="">
        <a href="https://github.com/notifications" class="Header-link notification-indicator position-relative tooltipped tooltipped-sw" aria-label="You have unread notifications" data-hotkey="g n" data-ga-click="Header, go to notifications, icon:unread" data-target="notification-indicator.link">
          <span class="mail-status unread " data-target="notification-indicator.modifier"></span>
          <svg class="octicon octicon-bell" height="16" viewBox="0 0 16 16" version="1.1" width="16" aria-hidden="true"><path d="M8 16a2 2 0 001.985-1.75c.017-.137-.097-.25-.235-.25h-3.5c-.138 0-.252.113-.235.25A2 2 0 008 16z"></path><path fill-rule="evenodd" d="M8 1.5A3.5 3.5 0 004.5 5v2.947c0 .346-.102.683-.294.97l-1.703 2.556a.018.018 0 00-.003.01l.001.006c0 .002.002.004.004.006a.017.017 0 00.006.004l.007.001h10.964l.007-.001a.016.016 0 00.006-.004.016.016 0 00.004-.006l.001-.007a.017.017 0 00-.003-.01l-1.703-2.554a1.75 1.75 0 01-.294-.97V5A3.5 3.5 0 008 1.5zM3 5a5 5 0 0110 0v2.947c0 .05.015.098.042.139l1.703 2.555A1.518 1.518 0 0113.482 13H2.518a1.518 1.518 0 01-1.263-2.36l1.703-2.554A.25.25 0 003 7.947V5z"></path></svg>
        </a>
      </notification-indicator>

    </div>


    <div class="Header-item position-relative d-none d-md-flex">
        <details class="details-overlay details-reset js-header-promo-toggle">
  <summary class="Header-link" aria-label="Create new…" data-ga-click="Header, create new, icon:add" aria-haspopup="menu" role="button">
      <svg class="octicon octicon-plus" height="16" viewBox="0 0 16 16" version="1.1" width="16" aria-hidden="true"><path fill-rule="evenodd" d="M7.75 2a.75.75 0 01.75.75V7h4.25a.75.75 0 110 1.5H8.5v4.25a.75.75 0 11-1.5 0V8.5H2.75a.75.75 0 010-1.5H7V2.75A.75.75 0 017.75 2z"></path></svg> <span class="dropdown-caret"></span>
  </summary>
  <details-menu class="dropdown-menu dropdown-menu-sw" role="menu">
    
<a role="menuitem" class="dropdown-item" href="https://github.com/new" data-ga-click="Header, create new repository">
  New repository
</a>

  <a role="menuitem" class="dropdown-item" href="https://github.com/new/import" data-ga-click="Header, import a repository">
    Import repository
  </a>

<a role="menuitem" class="dropdown-item" href="https://gist.github.com/" data-ga-click="Header, create new gist">
  New gist
</a>

  <a role="menuitem" class="dropdown-item" href="https://github.com/organizations/new" data-ga-click="Header, create new organization">
    New organization
  </a>


  <div role="none" class="dropdown-divider"></div>
  <div class="dropdown-header">
    <span title="Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM">This repository</span>
  </div>
    <a role="menuitem" class="dropdown-item" href="https://github.com/Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM/issues/new/choose" data-ga-click="Header, create new issue" data-skip-pjax="">
      New issue
    </a>


  </details-menu>
</details>

    </div>

    <div class="Header-item position-relative mr-0 d-none d-md-flex">
        
  <details class="details-overlay details-reset js-header-promo-toggle js-feature-preview-indicator-container" data-feature-preview-indicator-src="/users/Puneeth-Aacharya/feature_preview/indicator_check">

  <summary class="Header-link" aria-label="View profile and more" data-ga-click="Header, show menu, icon:avatar" aria-haspopup="menu" role="button">
    <img src="./DBMS_QUERIES_files/68151137(1)" alt="@Puneeth-Aacharya" size="20" height="20" width="20" class="avatar-user avatar avatar-small ">
      <span class="feature-preview-indicator js-feature-preview-indicator" style="top: 1px;" hidden=""></span>
    <span class="dropdown-caret"></span>
  </summary>
  <details-menu class="dropdown-menu dropdown-menu-sw" style="width: 180px" src="/users/68151137/menu" preload="" role="menu">
      <include-fragment>
        <p class="text-center mt-3" data-hide-on-error="">
          <svg style="box-sizing: content-box; color: var(--color-icon-primary);" viewBox="0 0 16 16" fill="none" width="32" height="32" class="anim-rotate">
  <circle cx="8" cy="8" r="7" stroke="currentColor" stroke-opacity="0.25" stroke-width="2" vector-effect="non-scaling-stroke"></circle>
  <path d="M15 8a7.002 7.002 0 00-7-7" stroke="currentColor" stroke-width="2" stroke-linecap="round" vector-effect="non-scaling-stroke"></path>
</svg>
        </p>
        <p class="ml-1 mb-2 mt-2 color-text-primary" data-show-on-error="">
          <svg class="octicon octicon-alert" height="16" viewBox="0 0 16 16" version="1.1" width="16" aria-hidden="true"><path fill-rule="evenodd" d="M8.22 1.754a.25.25 0 00-.44 0L1.698 13.132a.25.25 0 00.22.368h12.164a.25.25 0 00.22-.368L8.22 1.754zm-1.763-.707c.659-1.234 2.427-1.234 3.086 0l6.082 11.378A1.75 1.75 0 0114.082 15H1.918a1.75 1.75 0 01-1.543-2.575L6.457 1.047zM9 11a1 1 0 11-2 0 1 1 0 012 0zm-.25-5.25a.75.75 0 00-1.5 0v2.5a.75.75 0 001.5 0v-2.5z"></path></svg>
          Sorry, something went wrong.
        </p>
      </include-fragment>
  </details-menu>
</details>

    </div>
    
</header>

            
    </div>

  <div id="start-of-content" class="show-on-focus"></div>





    <div data-pjax-replace="" id="js-flash-container">


  <template class="js-flash-template"></template>
</div>


    

  <include-fragment class="js-notification-shelf-include-fragment" data-base-src="https://github.com/notifications/beta/shelf"></include-fragment>




  <div class="application-main " data-commit-hovercards-enabled="" data-discussion-hovercards-enabled="" data-issue-and-pr-hovercards-enabled="">
        <div itemscope="" itemtype="http://schema.org/SoftwareSourceCode" class="">
    <main id="js-repo-pjax-container" data-pjax-container="">
      

      




  


  <div class="color-bg-secondary pt-3 hide-full-screen mb-5">

      <div class="d-flex mb-3 px-3 px-md-4 px-lg-5">

        <div class="flex-auto min-width-0 width-fit mr-3">
            <h1 class=" d-flex flex-wrap flex-items-center break-word f3 text-normal">
    <svg class="octicon octicon-repo color-text-secondary mr-2" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M2 2.5A2.5 2.5 0 014.5 0h8.75a.75.75 0 01.75.75v12.5a.75.75 0 01-.75.75h-2.5a.75.75 0 110-1.5h1.75v-2h-8a1 1 0 00-.714 1.7.75.75 0 01-1.072 1.05A2.495 2.495 0 012 11.5v-9zm10.5-1V9h-8c-.356 0-.694.074-1 .208V2.5a1 1 0 011-1h8zM5 12.25v3.25a.25.25 0 00.4.2l1.45-1.087a.25.25 0 01.3 0L8.6 15.7a.25.25 0 00.4-.2v-3.25a.25.25 0 00-.25-.25h-3.5a.25.25 0 00-.25.25z"></path></svg>
  <span class="author flex-self-stretch" itemprop="author">
    <a class="url fn" rel="author" data-hovercard-type="user" data-hovercard-url="/users/Puneeth-Aacharya/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/Puneeth-Aacharya">Puneeth-Aacharya</a>
  </span>
  <span class="mx-1 flex-self-stretch color-text-secondary">/</span>
  <strong itemprop="name" class="mr-2 flex-self-stretch">
    <a data-pjax="#js-repo-pjax-container" href="https://github.com/Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM">HOSPITAL-MANAGEMENT-SYSTEM</a>
  </strong>
  
</h1>


        </div>

          <ul class="pagehead-actions flex-shrink-0 d-none d-md-inline" style="padding: 2px 0;">

  <li>
        <notifications-list-subscription-form class="f5 position-relative d-flex" data-catalyst="">
      <details class="details-reset details-overlay f5 position-relative" data-target="notifications-list-subscription-form.details" data-action="toggle:notifications-list-subscription-form#detailsToggled">

      <summary class="btn btn-sm rounded-right-0" data-hydro-click="{&quot;event_type&quot;:&quot;repository.click&quot;,&quot;payload&quot;:{&quot;target&quot;:&quot;WATCH_BUTTON&quot;,&quot;repository_id&quot;:335827863,&quot;originating_url&quot;:&quot;https://github.com/Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM/blob/main/Admin%20Login%20page.png&quot;,&quot;user_id&quot;:68151137}}" data-hydro-click-hmac="2731dfd6f2d754fba5f5f2c668321d02aacac7b1783cb6acefac1e4cbb65148b" data-ga-click="Repository, click Watch settings, action:blob#show" aria-label="Notifications settings" role="button" aria-haspopup="menu">
          <span data-menu-button="">
            <span data-target="notifications-list-subscription-form.unwatchButtonCopy">
              <svg class="octicon octicon-eye" height="16" viewBox="0 0 16 16" version="1.1" width="16" aria-hidden="true"><path fill-rule="evenodd" d="M1.679 7.932c.412-.621 1.242-1.75 2.366-2.717C5.175 4.242 6.527 3.5 8 3.5c1.473 0 2.824.742 3.955 1.715 1.124.967 1.954 2.096 2.366 2.717a.119.119 0 010 .136c-.412.621-1.242 1.75-2.366 2.717C10.825 11.758 9.473 12.5 8 12.5c-1.473 0-2.824-.742-3.955-1.715C2.92 9.818 2.09 8.69 1.679 8.068a.119.119 0 010-.136zM8 2c-1.981 0-3.67.992-4.933 2.078C1.797 5.169.88 6.423.43 7.1a1.619 1.619 0 000 1.798c.45.678 1.367 1.932 2.637 3.024C4.329 13.008 6.019 14 8 14c1.981 0 3.67-.992 4.933-2.078 1.27-1.091 2.187-2.345 2.637-3.023a1.619 1.619 0 000-1.798c-.45-.678-1.367-1.932-2.637-3.023C11.671 2.992 9.981 2 8 2zm0 8a2 2 0 100-4 2 2 0 000 4z"></path></svg>
              Unwatch
            </span>
            <span hidden="" data-target="notifications-list-subscription-form.stopIgnoringButtonCopy">
              <svg class="octicon octicon-bell-slash" height="16" viewBox="0 0 16 16" version="1.1" width="16" aria-hidden="true"><path fill-rule="evenodd" d="M8 1.5c-.997 0-1.895.416-2.534 1.086A.75.75 0 014.38 1.55 5 5 0 0113 5v2.373a.75.75 0 01-1.5 0V5A3.5 3.5 0 008 1.5zM4.182 4.31L1.19 2.143a.75.75 0 10-.88 1.214L3 5.305v2.642a.25.25 0 01-.042.139L1.255 10.64A1.518 1.518 0 002.518 13h11.108l1.184.857a.75.75 0 10.88-1.214l-1.375-.996a1.196 1.196 0 00-.013-.01L4.198 4.321a.733.733 0 00-.016-.011zm7.373 7.19L4.5 6.391v1.556c0 .346-.102.683-.294.97l-1.703 2.556a.018.018 0 00-.003.01.015.015 0 00.005.012.017.017 0 00.006.004l.007.001h9.037zM8 16a2 2 0 001.985-1.75c.017-.137-.097-.25-.235-.25h-3.5c-.138 0-.252.113-.235.25A2 2 0 008 16z"></path></svg>
              Stop ignoring
            </span>
            <span hidden="" data-target="notifications-list-subscription-form.watchButtonCopy">
              <svg class="octicon octicon-eye" height="16" viewBox="0 0 16 16" version="1.1" width="16" aria-hidden="true"><path fill-rule="evenodd" d="M1.679 7.932c.412-.621 1.242-1.75 2.366-2.717C5.175 4.242 6.527 3.5 8 3.5c1.473 0 2.824.742 3.955 1.715 1.124.967 1.954 2.096 2.366 2.717a.119.119 0 010 .136c-.412.621-1.242 1.75-2.366 2.717C10.825 11.758 9.473 12.5 8 12.5c-1.473 0-2.824-.742-3.955-1.715C2.92 9.818 2.09 8.69 1.679 8.068a.119.119 0 010-.136zM8 2c-1.981 0-3.67.992-4.933 2.078C1.797 5.169.88 6.423.43 7.1a1.619 1.619 0 000 1.798c.45.678 1.367 1.932 2.637 3.024C4.329 13.008 6.019 14 8 14c1.981 0 3.67-.992 4.933-2.078 1.27-1.091 2.187-2.345 2.637-3.023a1.619 1.619 0 000-1.798c-.45-.678-1.367-1.932-2.637-3.023C11.671 2.992 9.981 2 8 2zm0 8a2 2 0 100-4 2 2 0 000 4z"></path></svg>
              Watch
            </span>
          </span>
          <span class="dropdown-caret"></span>
</summary>
        <details-menu class="SelectMenu  " role="menu" data-target="notifications-list-subscription-form.menu">
          <div class="SelectMenu-modal notifications-component-menu-modal">
            <header class="SelectMenu-header">
              <h3 class="SelectMenu-title">Notifications</h3>
              <button class="SelectMenu-closeButton" type="button" aria-label="Close menu" data-action="click:notifications-list-subscription-form#closeMenu">
                <svg class="octicon octicon-x" height="16" viewBox="0 0 16 16" version="1.1" width="16" aria-hidden="true"><path fill-rule="evenodd" d="M3.72 3.72a.75.75 0 011.06 0L8 6.94l3.22-3.22a.75.75 0 111.06 1.06L9.06 8l3.22 3.22a.75.75 0 11-1.06 1.06L8 9.06l-3.22 3.22a.75.75 0 01-1.06-1.06L6.94 8 3.72 4.78a.75.75 0 010-1.06z"></path></svg>
              </button>
            </header>

            <div class="SelectMenu-list">
              <form data-target="notifications-list-subscription-form.form" data-action="submit:notifications-list-subscription-form#submitForm" action="https://github.com/notifications/subscribe" accept-charset="UTF-8" method="post"><input type="hidden" name="authenticity_token" value="9dMb+kwCkRu/u4CjZCGAMUILBzmkEhuXclmIEPPjd0/VXRcqXmT0QGFfRLD/S6e84QHDIL7TaWV36YC0yPa7ww==">

                <input type="hidden" name="repository_id" value="335827863">

                <button type="submit" name="do" value="included" class="SelectMenu-item flex-items-start" role="menuitemradio" aria-checked="false" data-targets="notifications-list-subscription-form.subscriptionButtons">
                  <span class="f5">
                    <svg class="octicon octicon-check SelectMenu-icon SelectMenu-icon--check" height="16" viewBox="0 0 16 16" version="1.1" width="16" aria-hidden="true"><path fill-rule="evenodd" d="M13.78 4.22a.75.75 0 010 1.06l-7.25 7.25a.75.75 0 01-1.06 0L2.22 9.28a.75.75 0 011.06-1.06L6 10.94l6.72-6.72a.75.75 0 011.06 0z"></path></svg>
                  </span>
                  <div>
                    <div class="f5 text-bold">
                      Participating and @mentions
                    </div>
                    <div class="text-small color-text-secondary text-normal pb-1">
                      Only receive notifications from this repository when participating or @mentioned.
                    </div>
                  </div>
                </button>

                <button type="submit" name="do" value="subscribed" class="SelectMenu-item flex-items-start" role="menuitemradio" aria-checked="true" data-targets="notifications-list-subscription-form.subscriptionButtons">
                  <span class="f5">
                    <svg class="octicon octicon-check SelectMenu-icon SelectMenu-icon--check" height="16" viewBox="0 0 16 16" version="1.1" width="16" aria-hidden="true"><path fill-rule="evenodd" d="M13.78 4.22a.75.75 0 010 1.06l-7.25 7.25a.75.75 0 01-1.06 0L2.22 9.28a.75.75 0 011.06-1.06L6 10.94l6.72-6.72a.75.75 0 011.06 0z"></path></svg>
                  </span>
                  <div>
                    <div class="f5 text-bold">
                      All Activity
                    </div>
                    <div class="text-small color-text-secondary text-normal pb-1">
                      Notified of all notifications on this repository.
                    </div>
                  </div>
                </button>

                <button type="submit" name="do" value="ignore" class="SelectMenu-item flex-items-start" role="menuitemradio" aria-checked="false" data-targets="notifications-list-subscription-form.subscriptionButtons">
                  <span class="f5">
                    <svg class="octicon octicon-check SelectMenu-icon SelectMenu-icon--check" height="16" viewBox="0 0 16 16" version="1.1" width="16" aria-hidden="true"><path fill-rule="evenodd" d="M13.78 4.22a.75.75 0 010 1.06l-7.25 7.25a.75.75 0 01-1.06 0L2.22 9.28a.75.75 0 011.06-1.06L6 10.94l6.72-6.72a.75.75 0 011.06 0z"></path></svg>
                  </span>
                  <div>
                    <div class="f5 text-bold">
                      Ignore
                    </div>
                    <div class="text-small color-text-secondary text-normal pb-1">
                      Never be notified.
                    </div>
                  </div>
                </button>
</form>
              <button class="SelectMenu-item flex-items-start pr-3" type="button" role="menuitemradio" data-target="notifications-list-subscription-form.customButton" data-action="click:notifications-list-subscription-form#openCustomDialog" aria-haspopup="true" aria-checked="false">
                <span class="f5">
                  <svg class="octicon octicon-check SelectMenu-icon SelectMenu-icon--check" height="16" viewBox="0 0 16 16" version="1.1" width="16" aria-hidden="true"><path fill-rule="evenodd" d="M13.78 4.22a.75.75 0 010 1.06l-7.25 7.25a.75.75 0 01-1.06 0L2.22 9.28a.75.75 0 011.06-1.06L6 10.94l6.72-6.72a.75.75 0 011.06 0z"></path></svg>
                </span>
                <div>
                  <div class="d-flex flex-items-start flex-justify-between">
                    <div class="f5 text-bold">Custom</div>
                    <div class="f5 pr-1">
                      <svg class="octicon octicon-arrow-right" height="16" viewBox="0 0 16 16" version="1.1" width="16" aria-hidden="true"><path fill-rule="evenodd" d="M8.22 2.97a.75.75 0 011.06 0l4.25 4.25a.75.75 0 010 1.06l-4.25 4.25a.75.75 0 01-1.06-1.06l2.97-2.97H3.75a.75.75 0 010-1.5h7.44L8.22 4.03a.75.75 0 010-1.06z"></path></svg>
                    </div>
                  </div>
                  <div class="text-small color-text-secondary text-normal pb-1">
                    Select events you want to be notified of in addition to participating and @mentions.
                  </div>
                </div>
              </button>
            </div>
          </div>
        </details-menu>

        <details-dialog class="notifications-component-dialog " data-target="notifications-list-subscription-form.customDialog" hidden="" role="dialog" aria-modal="true">
          <div class="SelectMenu-modal notifications-component-dialog-modal overflow-visible">
            <form data-target="notifications-list-subscription-form.customform" data-action="submit:notifications-list-subscription-form#submitCustomForm" action="https://github.com/notifications/subscribe" accept-charset="UTF-8" method="post"><input type="hidden" name="authenticity_token" value="yz4JpzJCfUY4v+JSgNId5ri0IlK9jv5kvrSk3syznh3rsAV3ICQYHeZbJkEbuDprG77mS6dPjJa7BKx696ZSkQ==">

              <input type="hidden" name="repository_id" value="335827863">

              <header class="d-sm-none SelectMenu-header pb-0 border-bottom-0 px-2 px-sm-3">
                <h1 class="f3 SelectMenu-title d-inline-flex">
                  <button class="color-bg-primary border-0 px-2 py-0 m-0 Link--secondary f5" aria-label="Return to menu" type="button" data-action="click:notifications-list-subscription-form#closeCustomDialog">
                    <svg style="" class="octicon octicon-arrow-left" height="16" viewBox="0 0 16 16" version="1.1" width="16" aria-hidden="true"><path fill-rule="evenodd" d="M7.78 12.53a.75.75 0 01-1.06 0L2.47 8.28a.75.75 0 010-1.06l4.25-4.25a.75.75 0 011.06 1.06L4.81 7h7.44a.75.75 0 010 1.5H4.81l2.97 2.97a.75.75 0 010 1.06z"></path></svg>
                  </button>
                  Custom
                </h1>
              </header>

              <header class="d-none d-sm-flex flex-items-start pt-1">
                <button class="border-0 px-2 pt-1 m-0 Link--secondary f5" style="background-color: transparent;" aria-label="Return to menu" type="button" data-action="click:notifications-list-subscription-form#closeCustomDialog">
                  <svg style="position: relative; left: 2px; top: 1px" class="octicon octicon-arrow-left" height="16" viewBox="0 0 16 16" version="1.1" width="16" aria-hidden="true"><path fill-rule="evenodd" d="M7.78 12.53a.75.75 0 01-1.06 0L2.47 8.28a.75.75 0 010-1.06l4.25-4.25a.75.75 0 011.06 1.06L4.81 7h7.44a.75.75 0 010 1.5H4.81l2.97 2.97a.75.75 0 010 1.06z"></path></svg>
                </button>

                <h1 class="pt-1 pr-4 pb-0 pl-0 f5 text-bold">
                  Custom
                </h1>
              </header>

              <fieldset>
                <legend>
                  <div class="text-small color-text-secondary pt-0 pr-3 pb-3 pl-6 pl-sm-5 border-bottom mb-3">
                    Select events you want to be notified of in addition to participating and @mentions.
                  </div>
                </legend>
                  <div class="form-checkbox mr-3 ml-6 ml-sm-5 mb-2 mt-0">
                    <label class="f5 text-normal">
                      <input type="checkbox" name="thread_types[]" value="Issue" data-targets="notifications-list-subscription-form.threadTypeCheckboxes" data-action="change:notifications-list-subscription-form#threadTypeCheckboxesUpdated">
                      Issues
                    </label>

                  </div>
                  <div class="form-checkbox mr-3 ml-6 ml-sm-5 mb-2 mt-0">
                    <label class="f5 text-normal">
                      <input type="checkbox" name="thread_types[]" value="PullRequest" data-targets="notifications-list-subscription-form.threadTypeCheckboxes" data-action="change:notifications-list-subscription-form#threadTypeCheckboxesUpdated">
                      Pull requests
                    </label>

                  </div>
                  <div class="form-checkbox mr-3 ml-6 ml-sm-5 mb-2 mt-0">
                    <label class="f5 text-normal">
                      <input type="checkbox" name="thread_types[]" value="Release" data-targets="notifications-list-subscription-form.threadTypeCheckboxes" data-action="change:notifications-list-subscription-form#threadTypeCheckboxesUpdated">
                      Releases
                    </label>

                  </div>
                  <div class="form-checkbox mr-3 ml-6 ml-sm-5 mb-2 mt-0">
                    <label class="f5 text-normal">
                      <input type="checkbox" name="thread_types[]" value="Discussion" data-targets="notifications-list-subscription-form.threadTypeCheckboxes" data-action="change:notifications-list-subscription-form#threadTypeCheckboxesUpdated">
                      Discussions
                    </label>

                      <span class="tooltipped tooltipped-nw mr-2 p-1 float-right" aria-label="Discussions are not enabled for this repo">
                        <svg class="octicon octicon-info color-icon-secondary" height="16" viewBox="0 0 16 16" version="1.1" width="16" aria-hidden="true"><path fill-rule="evenodd" d="M8 1.5a6.5 6.5 0 100 13 6.5 6.5 0 000-13zM0 8a8 8 0 1116 0A8 8 0 010 8zm6.5-.25A.75.75 0 017.25 7h1a.75.75 0 01.75.75v2.75h.25a.75.75 0 010 1.5h-2a.75.75 0 010-1.5h.25v-2h-.25a.75.75 0 01-.75-.75zM8 6a1 1 0 100-2 1 1 0 000 2z"></path></svg>
                      </span>
                  </div>
                  <div class="form-checkbox mr-3 ml-6 ml-sm-5 mb-2 mt-0">
                    <label class="f5 text-normal">
                      <input type="checkbox" name="thread_types[]" value="SecurityAlert" data-targets="notifications-list-subscription-form.threadTypeCheckboxes" data-action="change:notifications-list-subscription-form#threadTypeCheckboxesUpdated">
                      Security alerts
                    </label>

                  </div>
              </fieldset>
              <div class="pt-2 pb-3 px-3 d-flex flex-justify-start flex-row-reverse">
                <button type="submit" name="do" value="custom" class="btn btn-sm btn-primary ml-2" data-target="notifications-list-subscription-form.customSubmit" disabled="">Apply</button>

                <button class="btn btn-sm" type="button" data-action="click:notifications-list-subscription-form#resetForm" data-close-dialog="">Cancel</button>
              </div>
</form>          </div>
        </details-dialog>
        <div class="notifications-component-dialog-overlay"></div>
      </details>
        <a class="social-count" href="https://github.com/Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM/watchers" aria-label="1 user is watching this repository" data-target="notifications-list-subscription-form.socialCount">
          1
        </a>
    </notifications-list-subscription-form>



  </li>

  <li>
        <div class="d-block js-toggler-container js-social-container starring-container ">
    <form class="starred js-social-form" action="https://github.com/Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM/unstar" accept-charset="UTF-8" method="post"><input type="hidden" name="authenticity_token" value="9U4hjS8QrII3w3iX9rrJQ9il7sXDjzGKLsGf/pqjV4/3go23tfGUuWH8rk4KAJmwbbza4sxus6oHkGEzi4Sa4w==">
      <input type="hidden" name="context" value="repository">
      <button type="submit" class="btn btn-sm btn-with-count  js-toggler-target" aria-label="Unstar this repository" title="Unstar Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM" data-hydro-click="{&quot;event_type&quot;:&quot;repository.click&quot;,&quot;payload&quot;:{&quot;target&quot;:&quot;UNSTAR_BUTTON&quot;,&quot;repository_id&quot;:335827863,&quot;originating_url&quot;:&quot;https://github.com/Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM/blob/main/Admin%20Login%20page.png&quot;,&quot;user_id&quot;:68151137}}" data-hydro-click-hmac="09a82a6db98b4ff2ec30067d2d305bfd4a0d9f304587a403c25297c5694d0fef" data-ga-click="Repository, click unstar button, action:blob#show; text:Unstar">        <svg class="octicon octicon-star-fill mr-1" height="16" viewBox="0 0 16 16" version="1.1" width="16" aria-hidden="true"><path fill-rule="evenodd" d="M8 .25a.75.75 0 01.673.418l1.882 3.815 4.21.612a.75.75 0 01.416 1.279l-3.046 2.97.719 4.192a.75.75 0 01-1.088.791L8 12.347l-3.766 1.98a.75.75 0 01-1.088-.79l.72-4.194L.818 6.374a.75.75 0 01.416-1.28l4.21-.611L7.327.668A.75.75 0 018 .25z"></path></svg>
        <span>
          Unstar
</span></button>        <a class="social-count js-social-count" href="https://github.com/Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM/stargazers" aria-label="0 users starred this repository">
           0
        </a>
</form>
    <form class="unstarred js-social-form" action="https://github.com/Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM/star" accept-charset="UTF-8" method="post"><input type="hidden" name="authenticity_token" value="JZ4ic8S078154l9BTCtmXx8qMpjp4QMXj5QMgG2AJNuqCiZqH02DbQ+JMCZ3U0QxMlhsO0yci//JnQVjnq6QHw==">
      <input type="hidden" name="context" value="repository">
      <button type="submit" class="btn btn-sm btn-with-count  js-toggler-target" aria-label="Unstar this repository" title="Star Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM" data-hydro-click="{&quot;event_type&quot;:&quot;repository.click&quot;,&quot;payload&quot;:{&quot;target&quot;:&quot;STAR_BUTTON&quot;,&quot;repository_id&quot;:335827863,&quot;originating_url&quot;:&quot;https://github.com/Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM/blob/main/Admin%20Login%20page.png&quot;,&quot;user_id&quot;:68151137}}" data-hydro-click-hmac="170eabd0e17ebbef5ae8a226ef59545e31e2c823e1e45c45cb8aad450182ace8" data-ga-click="Repository, click star button, action:blob#show; text:Star">        <svg class="octicon octicon-star mr-1" height="16" viewBox="0 0 16 16" version="1.1" width="16" aria-hidden="true"><path fill-rule="evenodd" d="M8 .25a.75.75 0 01.673.418l1.882 3.815 4.21.612a.75.75 0 01.416 1.279l-3.046 2.97.719 4.192a.75.75 0 01-1.088.791L8 12.347l-3.766 1.98a.75.75 0 01-1.088-.79l.72-4.194L.818 6.374a.75.75 0 01.416-1.28l4.21-.611L7.327.668A.75.75 0 018 .25zm0 2.445L6.615 5.5a.75.75 0 01-.564.41l-3.097.45 2.24 2.184a.75.75 0 01.216.664l-.528 3.084 2.769-1.456a.75.75 0 01.698 0l2.77 1.456-.53-3.084a.75.75 0 01.216-.664l2.24-2.183-3.096-.45a.75.75 0 01-.564-.41L8 2.694v.001z"></path></svg>
        <span>
          Star
</span></button>        <a class="social-count js-social-count" href="https://github.com/Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM/stargazers" aria-label="0 users starred this repository">
          0
        </a>
</form>  </div>

  </li>

  <li>
          <span class="btn btn-sm btn-with-count disabled tooltipped tooltipped-sw" aria-label="Cannot fork because you own this repository and are not a member of any organizations.">
            <svg class="octicon octicon-repo-forked" height="16" viewBox="0 0 16 16" version="1.1" width="16" aria-hidden="true"><path fill-rule="evenodd" d="M5 3.25a.75.75 0 11-1.5 0 .75.75 0 011.5 0zm0 2.122a2.25 2.25 0 10-1.5 0v.878A2.25 2.25 0 005.75 8.5h1.5v2.128a2.251 2.251 0 101.5 0V8.5h1.5a2.25 2.25 0 002.25-2.25v-.878a2.25 2.25 0 10-1.5 0v.878a.75.75 0 01-.75.75h-4.5A.75.75 0 015 6.25v-.878zm3.75 7.378a.75.75 0 11-1.5 0 .75.75 0 011.5 0zm3-8.75a.75.75 0 100-1.5.75.75 0 000 1.5z"></path></svg>
            Fork
</span>
      <a href="https://github.com/Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM/network/members" class="social-count" aria-label="0 users forked this repository">
        0
      </a>
  </li>
</ul>

      </div>
        

  <nav data-pjax="#js-repo-pjax-container" aria-label="Repository" class="js-repo-nav js-sidenav-container-pjax js-responsive-underlinenav overflow-hidden UnderlineNav px-3 px-md-4 px-lg-5 color-bg-secondary">

    <ul class="UnderlineNav-body list-style-none ">
        <li class="d-flex">
  <a href="https://github.com/Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM" data-tab-item="i0code-tab" data-selected-links="repo_source repo_downloads repo_commits repo_releases repo_tags repo_branches repo_packages repo_deployments /Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM" data-hotkey="g c" data-ga-click="Repository, Navigation click, Code tab" aria-current="page" class="UnderlineNav-item hx_underlinenav-item no-wrap js-responsive-underlinenav-item selected ">
    
                  <svg class="octicon octicon-code UnderlineNav-octicon d-none d-sm-inline" height="16" viewBox="0 0 16 16" version="1.1" width="16" aria-hidden="true"><path fill-rule="evenodd" d="M4.72 3.22a.75.75 0 011.06 1.06L2.06 8l3.72 3.72a.75.75 0 11-1.06 1.06L.47 8.53a.75.75 0 010-1.06l4.25-4.25zm6.56 0a.75.75 0 10-1.06 1.06L13.94 8l-3.72 3.72a.75.75 0 101.06 1.06l4.25-4.25a.75.75 0 000-1.06l-4.25-4.25z"></path></svg>
          <span data-content="Code">Code</span>
            <span title="Not available" class="Counter "></span>

    
</a></li>
        <li class="d-flex">
  <a href="https://github.com/Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM/issues" data-tab-item="i1issues-tab" data-selected-links="repo_issues repo_labels repo_milestones /Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM/issues" data-hotkey="g i" data-ga-click="Repository, Navigation click, Issues tab" class="UnderlineNav-item hx_underlinenav-item no-wrap js-responsive-underlinenav-item ">
    
                  <svg class="octicon octicon-issue-opened UnderlineNav-octicon d-none d-sm-inline" height="16" viewBox="0 0 16 16" version="1.1" width="16" aria-hidden="true"><path fill-rule="evenodd" d="M8 1.5a6.5 6.5 0 100 13 6.5 6.5 0 000-13zM0 8a8 8 0 1116 0A8 8 0 010 8zm9 3a1 1 0 11-2 0 1 1 0 012 0zm-.25-6.25a.75.75 0 00-1.5 0v3.5a.75.75 0 001.5 0v-3.5z"></path></svg>
          <span data-content="Issues">Issues</span>
            <span title="0" hidden="hidden" class="Counter ">0</span>

    
</a></li>
        <li class="d-flex">
  <a href="https://github.com/Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM/pulls" data-tab-item="i2pull-requests-tab" data-selected-links="repo_pulls checks /Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM/pulls" data-hotkey="g p" data-ga-click="Repository, Navigation click, Pull requests tab" class="UnderlineNav-item hx_underlinenav-item no-wrap js-responsive-underlinenav-item ">
    
                  <svg class="octicon octicon-git-pull-request UnderlineNav-octicon d-none d-sm-inline" height="16" viewBox="0 0 16 16" version="1.1" width="16" aria-hidden="true"><path fill-rule="evenodd" d="M7.177 3.073L9.573.677A.25.25 0 0110 .854v4.792a.25.25 0 01-.427.177L7.177 3.427a.25.25 0 010-.354zM3.75 2.5a.75.75 0 100 1.5.75.75 0 000-1.5zm-2.25.75a2.25 2.25 0 113 2.122v5.256a2.251 2.251 0 11-1.5 0V5.372A2.25 2.25 0 011.5 3.25zM11 2.5h-1V4h1a1 1 0 011 1v5.628a2.251 2.251 0 101.5 0V5A2.5 2.5 0 0011 2.5zm1 10.25a.75.75 0 111.5 0 .75.75 0 01-1.5 0zM3.75 12a.75.75 0 100 1.5.75.75 0 000-1.5z"></path></svg>
          <span data-content="Pull requests">Pull requests</span>
            <span title="0" hidden="hidden" class="Counter ">0</span>

    
</a></li>
        <li class="d-flex">
  <a href="https://github.com/Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM/actions" data-tab-item="i3actions-tab" data-selected-links="repo_actions /Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM/actions" data-hotkey="g a" data-ga-click="Repository, Navigation click, Actions tab" class="UnderlineNav-item hx_underlinenav-item no-wrap js-responsive-underlinenav-item ">
    
                  <svg class="octicon octicon-play UnderlineNav-octicon d-none d-sm-inline" height="16" viewBox="0 0 16 16" version="1.1" width="16" aria-hidden="true"><path fill-rule="evenodd" d="M1.5 8a6.5 6.5 0 1113 0 6.5 6.5 0 01-13 0zM8 0a8 8 0 100 16A8 8 0 008 0zM6.379 5.227A.25.25 0 006 5.442v5.117a.25.25 0 00.379.214l4.264-2.559a.25.25 0 000-.428L6.379 5.227z"></path></svg>
          <span data-content="Actions">Actions</span>
            <span title="Not available" class="Counter "></span>

    
</a></li>
        <li class="d-flex">
  <a href="https://github.com/Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM/projects" data-tab-item="i4projects-tab" data-selected-links="repo_projects new_repo_project repo_project /Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM/projects" data-hotkey="g b" data-ga-click="Repository, Navigation click, Projects tab" class="UnderlineNav-item hx_underlinenav-item no-wrap js-responsive-underlinenav-item ">
    
                  <svg class="octicon octicon-project UnderlineNav-octicon d-none d-sm-inline" height="16" viewBox="0 0 16 16" version="1.1" width="16" aria-hidden="true"><path fill-rule="evenodd" d="M1.75 0A1.75 1.75 0 000 1.75v12.5C0 15.216.784 16 1.75 16h12.5A1.75 1.75 0 0016 14.25V1.75A1.75 1.75 0 0014.25 0H1.75zM1.5 1.75a.25.25 0 01.25-.25h12.5a.25.25 0 01.25.25v12.5a.25.25 0 01-.25.25H1.75a.25.25 0 01-.25-.25V1.75zM11.75 3a.75.75 0 00-.75.75v7.5a.75.75 0 001.5 0v-7.5a.75.75 0 00-.75-.75zm-8.25.75a.75.75 0 011.5 0v5.5a.75.75 0 01-1.5 0v-5.5zM8 3a.75.75 0 00-.75.75v3.5a.75.75 0 001.5 0v-3.5A.75.75 0 008 3z"></path></svg>
          <span data-content="Projects">Projects</span>
            <span title="0" hidden="hidden" class="Counter ">0</span>

    
</a></li>
        <li class="d-flex">
  <a href="https://github.com/Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM/wiki" data-tab-item="i5wiki-tab" data-selected-links="repo_wiki /Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM/wiki" data-hotkey="g w" data-ga-click="Repository, Navigation click, Wikis tab" class="UnderlineNav-item hx_underlinenav-item no-wrap js-responsive-underlinenav-item ">
    
                  <svg class="octicon octicon-book UnderlineNav-octicon d-none d-sm-inline" height="16" viewBox="0 0 16 16" version="1.1" width="16" aria-hidden="true"><path fill-rule="evenodd" d="M0 1.75A.75.75 0 01.75 1h4.253c1.227 0 2.317.59 3 1.501A3.744 3.744 0 0111.006 1h4.245a.75.75 0 01.75.75v10.5a.75.75 0 01-.75.75h-4.507a2.25 2.25 0 00-1.591.659l-.622.621a.75.75 0 01-1.06 0l-.622-.621A2.25 2.25 0 005.258 13H.75a.75.75 0 01-.75-.75V1.75zm8.755 3a2.25 2.25 0 012.25-2.25H14.5v9h-3.757c-.71 0-1.4.201-1.992.572l.004-7.322zm-1.504 7.324l.004-5.073-.002-2.253A2.25 2.25 0 005.003 2.5H1.5v9h3.757a3.75 3.75 0 011.994.574z"></path></svg>
          <span data-content="Wiki">Wiki</span>
            <span title="Not available" class="Counter "></span>

    
</a></li>
        <li class="d-flex">
  <a href="https://github.com/Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM/security" data-tab-item="i6security-tab" data-selected-links="security overview alerts policy token_scanning code_scanning /Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM/security" data-hotkey="g s" data-ga-click="Repository, Navigation click, Security tab" class="UnderlineNav-item hx_underlinenav-item no-wrap js-responsive-underlinenav-item ">
    
                  <svg class="octicon octicon-shield UnderlineNav-octicon d-none d-sm-inline" height="16" viewBox="0 0 16 16" version="1.1" width="16" aria-hidden="true"><path fill-rule="evenodd" d="M7.467.133a1.75 1.75 0 011.066 0l5.25 1.68A1.75 1.75 0 0115 3.48V7c0 1.566-.32 3.182-1.303 4.682-.983 1.498-2.585 2.813-5.032 3.855a1.7 1.7 0 01-1.33 0c-2.447-1.042-4.049-2.357-5.032-3.855C1.32 10.182 1 8.566 1 7V3.48a1.75 1.75 0 011.217-1.667l5.25-1.68zm.61 1.429a.25.25 0 00-.153 0l-5.25 1.68a.25.25 0 00-.174.238V7c0 1.358.275 2.666 1.057 3.86.784 1.194 2.121 2.34 4.366 3.297a.2.2 0 00.154 0c2.245-.956 3.582-2.104 4.366-3.298C13.225 9.666 13.5 8.36 13.5 7V3.48a.25.25 0 00-.174-.237l-5.25-1.68zM9 10.5a1 1 0 11-2 0 1 1 0 012 0zm-.25-5.75a.75.75 0 10-1.5 0v3a.75.75 0 001.5 0v-3z"></path></svg>
          <span data-content="Security">Security</span>
            

    
</a></li>
        <li class="d-flex">
  <a href="https://github.com/Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM/pulse" data-tab-item="i7insights-tab" data-selected-links="repo_graphs repo_contributors dependency_graph dependabot_updates pulse people community /Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM/pulse" data-ga-click="Repository, Navigation click, Insights tab" class="UnderlineNav-item hx_underlinenav-item no-wrap js-responsive-underlinenav-item ">
    
                  <svg class="octicon octicon-graph UnderlineNav-octicon d-none d-sm-inline" height="16" viewBox="0 0 16 16" version="1.1" width="16" aria-hidden="true"><path fill-rule="evenodd" d="M1.5 1.75a.75.75 0 00-1.5 0v12.5c0 .414.336.75.75.75h14.5a.75.75 0 000-1.5H1.5V1.75zm14.28 2.53a.75.75 0 00-1.06-1.06L10 7.94 7.53 5.47a.75.75 0 00-1.06 0L3.22 8.72a.75.75 0 001.06 1.06L7 7.06l2.47 2.47a.75.75 0 001.06 0l5.25-5.25z"></path></svg>
          <span data-content="Insights">Insights</span>
            <span title="Not available" class="Counter "></span>

    
</a></li>
        <li class="d-flex">
  <a href="https://github.com/Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM/settings" data-tab-item="i8settings-tab" data-selected-links="repo_settings repo_branch_settings hooks integration_installations repo_keys_settings issue_template_editor secrets_settings key_links_settings repo_actions_settings notifications repository_environments interaction_limits /Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM/settings" data-ga-click="Repository, Navigation click, Settings tab" class="UnderlineNav-item hx_underlinenav-item no-wrap js-responsive-underlinenav-item ">
    
                  <svg class="octicon octicon-gear UnderlineNav-octicon d-none d-sm-inline" height="16" viewBox="0 0 16 16" version="1.1" width="16" aria-hidden="true"><path fill-rule="evenodd" d="M7.429 1.525a6.593 6.593 0 011.142 0c.036.003.108.036.137.146l.289 1.105c.147.56.55.967.997 1.189.174.086.341.183.501.29.417.278.97.423 1.53.27l1.102-.303c.11-.03.175.016.195.046.219.31.41.641.573.989.014.031.022.11-.059.19l-.815.806c-.411.406-.562.957-.53 1.456a4.588 4.588 0 010 .582c-.032.499.119 1.05.53 1.456l.815.806c.08.08.073.159.059.19a6.494 6.494 0 01-.573.99c-.02.029-.086.074-.195.045l-1.103-.303c-.559-.153-1.112-.008-1.529.27-.16.107-.327.204-.5.29-.449.222-.851.628-.998 1.189l-.289 1.105c-.029.11-.101.143-.137.146a6.613 6.613 0 01-1.142 0c-.036-.003-.108-.037-.137-.146l-.289-1.105c-.147-.56-.55-.967-.997-1.189a4.502 4.502 0 01-.501-.29c-.417-.278-.97-.423-1.53-.27l-1.102.303c-.11.03-.175-.016-.195-.046a6.492 6.492 0 01-.573-.989c-.014-.031-.022-.11.059-.19l.815-.806c.411-.406.562-.957.53-1.456a4.587 4.587 0 010-.582c.032-.499-.119-1.05-.53-1.456l-.815-.806c-.08-.08-.073-.159-.059-.19a6.44 6.44 0 01.573-.99c.02-.029.086-.075.195-.045l1.103.303c.559.153 1.112.008 1.529-.27.16-.107.327-.204.5-.29.449-.222.851-.628.998-1.189l.289-1.105c.029-.11.101-.143.137-.146zM8 0c-.236 0-.47.01-.701.03-.743.065-1.29.615-1.458 1.261l-.29 1.106c-.017.066-.078.158-.211.224a5.994 5.994 0 00-.668.386c-.123.082-.233.09-.3.071L3.27 2.776c-.644-.177-1.392.02-1.82.63a7.977 7.977 0 00-.704 1.217c-.315.675-.111 1.422.363 1.891l.815.806c.05.048.098.147.088.294a6.084 6.084 0 000 .772c.01.147-.038.246-.088.294l-.815.806c-.474.469-.678 1.216-.363 1.891.2.428.436.835.704 1.218.428.609 1.176.806 1.82.63l1.103-.303c.066-.019.176-.011.299.071.213.143.436.272.668.386.133.066.194.158.212.224l.289 1.106c.169.646.715 1.196 1.458 1.26a8.094 8.094 0 001.402 0c.743-.064 1.29-.614 1.458-1.26l.29-1.106c.017-.066.078-.158.211-.224a5.98 5.98 0 00.668-.386c.123-.082.233-.09.3-.071l1.102.302c.644.177 1.392-.02 1.82-.63.268-.382.505-.789.704-1.217.315-.675.111-1.422-.364-1.891l-.814-.806c-.05-.048-.098-.147-.088-.294a6.1 6.1 0 000-.772c-.01-.147.039-.246.088-.294l.814-.806c.475-.469.679-1.216.364-1.891a7.992 7.992 0 00-.704-1.218c-.428-.609-1.176-.806-1.82-.63l-1.103.303c-.066.019-.176.011-.299-.071a5.991 5.991 0 00-.668-.386c-.133-.066-.194-.158-.212-.224L10.16 1.29C9.99.645 9.444.095 8.701.031A8.094 8.094 0 008 0zm1.5 8a1.5 1.5 0 11-3 0 1.5 1.5 0 013 0zM11 8a3 3 0 11-6 0 3 3 0 016 0z"></path></svg>
          <span data-content="Settings">Settings</span>
            <span title="Not available" class="Counter "></span>

    
</a></li>
</ul>
      <div style="visibility:hidden;" class="UnderlineNav-actions  js-responsive-underlinenav-overflow position-absolute pr-3 pr-md-4 pr-lg-5 right-0">      <details class="details-overlay details-reset position-relative">
  <summary role="button">          <div class="UnderlineNav-item mr-0 border-0">
            <svg class="octicon octicon-kebab-horizontal" height="16" viewBox="0 0 16 16" version="1.1" width="16" aria-hidden="true"><path d="M8 9a1.5 1.5 0 100-3 1.5 1.5 0 000 3zM1.5 9a1.5 1.5 0 100-3 1.5 1.5 0 000 3zm13 0a1.5 1.5 0 100-3 1.5 1.5 0 000 3z"></path></svg>
            <span class="sr-only">More</span>
          </div>
</summary>
  <div>          <details-menu role="menu" class="dropdown-menu dropdown-menu-sw ">
  
            <ul>
                <li data-menu-item="i0code-tab" hidden="">
                  <a role="menuitem" class="js-selected-navigation-item dropdown-item" data-selected-links=" /Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM" href="https://github.com/Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM">
                    Code
</a>                </li>
                <li data-menu-item="i1issues-tab" hidden="">
                  <a role="menuitem" class="js-selected-navigation-item dropdown-item" data-selected-links=" /Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM/issues" href="https://github.com/Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM/issues">
                    Issues
</a>                </li>
                <li data-menu-item="i2pull-requests-tab" hidden="">
                  <a role="menuitem" class="js-selected-navigation-item dropdown-item" data-selected-links=" /Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM/pulls" href="https://github.com/Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM/pulls">
                    Pull requests
</a>                </li>
                <li data-menu-item="i3actions-tab" hidden="">
                  <a role="menuitem" class="js-selected-navigation-item dropdown-item" data-selected-links=" /Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM/actions" href="https://github.com/Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM/actions">
                    Actions
</a>                </li>
                <li data-menu-item="i4projects-tab" hidden="">
                  <a role="menuitem" class="js-selected-navigation-item dropdown-item" data-selected-links=" /Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM/projects" href="https://github.com/Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM/projects">
                    Projects
</a>                </li>
                <li data-menu-item="i5wiki-tab" hidden="">
                  <a role="menuitem" class="js-selected-navigation-item dropdown-item" data-selected-links=" /Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM/wiki" href="https://github.com/Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM/wiki">
                    Wiki
</a>                </li>
                <li data-menu-item="i6security-tab" hidden="">
                  <a role="menuitem" class="js-selected-navigation-item dropdown-item" data-selected-links=" /Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM/security" href="https://github.com/Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM/security">
                    Security
</a>                </li>
                <li data-menu-item="i7insights-tab" hidden="">
                  <a role="menuitem" class="js-selected-navigation-item dropdown-item" data-selected-links=" /Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM/pulse" href="https://github.com/Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM/pulse">
                    Insights
</a>                </li>
                <li data-menu-item="i8settings-tab" hidden="">
                  <a role="menuitem" class="js-selected-navigation-item dropdown-item" data-selected-links=" /Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM/settings" href="https://github.com/Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM/settings">
                    Settings
</a>                </li>
            </ul>

</details-menu></div>
</details></div>
</nav>

  </div>


<div class="container-xl clearfix new-discussion-timeline px-3 px-md-4 px-lg-5">
  <div id="repo-content-pjax-container" class="repository-content ">


  
<div>
  


    <a class="d-none js-permalink-shortcut" data-hotkey="y" href="https://github.com/Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM/blob/c93c97e1707f232da3de5b0c41a903d2a98e1b48/DBMS_QUERIES.sql">Permalink</a>

    <!-- blob contrib key: blob_contributors:v22:4d32159149a8290bf8844546dbb9d2648c0b28943990ddcc4e7dfee345394721 -->

    <div class="d-flex flex-items-start flex-shrink-0 pb-3 flex-wrap flex-md-nowrap flex-justify-between flex-md-justify-start">
      
<div class="position-relative">
  <details class="details-reset details-overlay mr-0 mb-0 " id="branch-select-menu">
    <summary class="btn css-truncate" data-hotkey="w" title="Switch branches or tags">
      <svg class="octicon octicon-git-branch text-gray" height="16" viewBox="0 0 16 16" version="1.1" width="16" aria-hidden="true"><path fill-rule="evenodd" d="M11.75 2.5a.75.75 0 100 1.5.75.75 0 000-1.5zm-2.25.75a2.25 2.25 0 113 2.122V6A2.5 2.5 0 0110 8.5H6a1 1 0 00-1 1v1.128a2.251 2.251 0 11-1.5 0V5.372a2.25 2.25 0 111.5 0v1.836A2.492 2.492 0 016 7h4a1 1 0 001-1v-.628A2.25 2.25 0 019.5 3.25zM4.25 12a.75.75 0 100 1.5.75.75 0 000-1.5zM3.5 3.25a.75.75 0 111.5 0 .75.75 0 01-1.5 0z"></path></svg>
      <span class="css-truncate-target" data-menu-button="">main</span>
      <span class="dropdown-caret"></span>
    </summary>

      
<div class="SelectMenu">
  <div class="SelectMenu-modal">
    <header class="SelectMenu-header">
      <span class="SelectMenu-title">Switch branches/tags</span>
      <button class="SelectMenu-closeButton" type="button" data-toggle-for="branch-select-menu"><svg aria-label="Close menu" aria-hidden="false" class="octicon octicon-x" height="16" viewBox="0 0 16 16" version="1.1" width="16"><path fill-rule="evenodd" d="M3.72 3.72a.75.75 0 011.06 0L8 6.94l3.22-3.22a.75.75 0 111.06 1.06L9.06 8l3.22 3.22a.75.75 0 11-1.06 1.06L8 9.06l-3.22 3.22a.75.75 0 01-1.06-1.06L6.94 8 3.72 4.78a.75.75 0 010-1.06z"></path></svg></button>
    </header>

    <input-demux data-action="tab-container-change:input-demux#storeInput tab-container-changed:input-demux#updateInput" data-catalyst="">
      <tab-container class="d-flex flex-column js-branches-tags-tabs" style="min-height: 0;">
        <div class="SelectMenu-filter">
          <input data-target="input-demux.source" id="context-commitish-filter-field" class="SelectMenu-input form-control" aria-owns="ref-list-branches" data-controls-ref-menu-id="ref-list-branches" autofocus="" autocomplete="off" aria-label="Find or create a branch…" placeholder="Find or create a branch…" type="text">
        </div>

        <div class="SelectMenu-tabs" role="tablist" data-target="input-demux.control">
          <button class="SelectMenu-tab" type="button" role="tab" aria-selected="true" tabindex="0">Branches</button>
          <button class="SelectMenu-tab" type="button" role="tab" aria-selected="false" tabindex="-1">Tags</button>
        </div>

        <div role="tabpanel" id="ref-list-branches" data-filter-placeholder="Find or create a branch…" class="d-flex flex-column flex-auto overflow-auto" tabindex="">
          <ref-selector type="branch" data-targets="input-demux.sinks" data-action="
              input-entered:ref-selector#inputEntered
              tab-selected:ref-selector#tabSelected
              focus-list:ref-selector#focusFirstListMember
            " query-endpoint="/Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM/refs" current-user-can-push="" cache-key="v0:1612411706.066416" current-committish="bWFpbg==" default-branch="bWFpbg==" name-with-owner="UHVuZWV0aC1BYWNoYXJ5YS9IT1NQSVRBTC1NQU5BR0VNRU5ULVNZU1RFTQ==" data-catalyst="">

              <template data-target="ref-selector.noMatchTemplate"></template>


            <!-- TODO: this max-height is necessary or else the branch list won't scroll.  why? -->
            <div data-target="ref-selector.listContainer" role="menu" class="SelectMenu-list " style="max-height: 330px">
              <div class="SelectMenu-loading pt-3 pb-0" aria-label="Menu is loading">
                <svg style="box-sizing: content-box; color: var(--color-icon-primary);" viewBox="0 0 16 16" fill="none" width="32" height="32" class="anim-rotate">
  <circle cx="8" cy="8" r="7" stroke="currentColor" stroke-opacity="0.25" stroke-width="2" vector-effect="non-scaling-stroke"></circle>
  <path d="M15 8a7.002 7.002 0 00-7-7" stroke="currentColor" stroke-width="2" stroke-linecap="round" vector-effect="non-scaling-stroke"></path>
</svg>
              </div>
            </div>

              <template data-target="ref-selector.itemTemplate"></template>


              <footer class="SelectMenu-footer"><a href="https://github.com/Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM/branches">View all branches</a></footer>
          </ref-selector>

        </div>

        <div role="tabpanel" id="tags-menu" data-filter-placeholder="Find a tag" class="d-flex flex-column flex-auto overflow-auto" tabindex="" hidden="">
          <ref-selector type="tag" data-action="
              input-entered:ref-selector#inputEntered
              tab-selected:ref-selector#tabSelected
              focus-list:ref-selector#focusFirstListMember
            " data-targets="input-demux.sinks" query-endpoint="/Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM/refs" cache-key="v0:1612411706.066416" current-committish="bWFpbg==" default-branch="bWFpbg==" name-with-owner="UHVuZWV0aC1BYWNoYXJ5YS9IT1NQSVRBTC1NQU5BR0VNRU5ULVNZU1RFTQ==" data-catalyst="">

            <template data-target="ref-selector.noMatchTemplate"></template>

              <template data-target="ref-selector.itemTemplate"></template>


            <div data-target="ref-selector.listContainer" role="menu" class="SelectMenu-list" style="max-height: 330px">
              <div class="SelectMenu-loading pt-3 pb-0" aria-label="Menu is loading">
                <svg style="box-sizing: content-box; color: var(--color-icon-primary);" viewBox="0 0 16 16" fill="none" width="32" height="32" class="anim-rotate">
  <circle cx="8" cy="8" r="7" stroke="currentColor" stroke-opacity="0.25" stroke-width="2" vector-effect="non-scaling-stroke"></circle>
  <path d="M15 8a7.002 7.002 0 00-7-7" stroke="currentColor" stroke-width="2" stroke-linecap="round" vector-effect="non-scaling-stroke"></path>
</svg>
              </div>
            </div>
              <footer class="SelectMenu-footer"><a href="https://github.com/Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM/tags">View all tags</a></footer>
          </ref-selector>
        </div>
      </tab-container>
    </input-demux>
  </div>
</div>

  </details>

</div>

      <h2 id="blob-path" class="breadcrumb flex-auto flex-self-center min-width-0 text-normal mx-2 width-full width-md-auto flex-order-1 flex-md-order-none mt-3 mt-md-0">
        <span class="js-repo-root text-bold"><span class="js-path-segment d-inline-block wb-break-all"><a data-pjax="true" href="https://github.com/Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM"><span>HOSPITAL-MANAGEMENT-SYSTEM</span></a></span></span><span class="separator">/</span><strong class="final-path">DBMS_QUERIES.sql</strong>
      </h2>
      <a href="https://github.com/Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM/find/main" class="js-pjax-capture-input btn mr-2 d-none d-md-block" data-pjax="" data-hotkey="t">
        Go to file
      </a>

      <details id="blob-more-options-details" class="details-overlay details-reset position-relative">
  <summary role="button" class="btn ">          <svg aria-label="More options" class="octicon octicon-kebab-horizontal" height="16" viewBox="0 0 16 16" version="1.1" width="16" role="img"><path d="M8 9a1.5 1.5 0 100-3 1.5 1.5 0 000 3zM1.5 9a1.5 1.5 0 100-3 1.5 1.5 0 000 3zm13 0a1.5 1.5 0 100-3 1.5 1.5 0 000 3z"></path></svg>
</summary>
  <div>          <ul class="dropdown-menu dropdown-menu-sw">
            <li class="d-block d-md-none">
              <a class="dropdown-item d-flex flex-items-baseline" data-hydro-click="{&quot;event_type&quot;:&quot;repository.click&quot;,&quot;payload&quot;:{&quot;target&quot;:&quot;FIND_FILE_BUTTON&quot;,&quot;repository_id&quot;:335827863,&quot;originating_url&quot;:&quot;https://github.com/Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM/blob/main/DBMS_QUERIES.sql?_pjax=%23repo-content-pjax-container&quot;,&quot;user_id&quot;:68151137}}" data-hydro-click-hmac="bb71781f7693821cd4e20aab55e5aa2c77cb190e371edc802bd1efce4dcc5389" data-ga-click="Repository, find file, location:repo overview" data-hotkey="t" data-pjax="true" href="https://github.com/Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM/find/main">
                <span class="flex-auto">Go to file</span>
                <span class="text-small color-text-secondary" aria-hidden="true">T</span>
</a>            </li>
            <li data-toggle-for="blob-more-options-details">
              <button type="button" data-toggle-for="jumpto-line-details-dialog" class="btn-link dropdown-item">
                <span class="d-flex flex-items-baseline">
                  <span class="flex-auto">Go to line</span>
                  <span class="text-small color-text-secondary" aria-hidden="true">L</span>
                </span>
              </button>
            </li>
            <li class="dropdown-divider" role="none"></li>
            <li>
              <clipboard-copy value="DBMS_QUERIES.sql" class="dropdown-item cursor-pointer" data-toggle-for="blob-more-options-details" tabindex="0" role="button">
                Copy path
              </clipboard-copy>
            </li>
            <li>
              <clipboard-copy value="https://github.com/Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM/blob/c93c97e1707f232da3de5b0c41a903d2a98e1b48/DBMS_QUERIES.sql" class="dropdown-item cursor-pointer" data-toggle-for="blob-more-options-details" tabindex="0" role="button">
                <span class="d-flex flex-items-baseline">
                  <span class="flex-auto">Copy permalink</span>
                </span>
              </clipboard-copy>
            </li>
          </ul>
</div>
</details>    </div>



    <div class="Box d-flex flex-column flex-shrink-0 mb-3">
      

  <div class="Box-header Box-header--blue Details js-details-container">
      <div class="d-flex flex-items-center">
        <span class="flex-shrink-0 ml-n1 mr-n1 mt-n1 mb-n1">
          <a rel="author" data-skip-pjax="true" data-hovercard-type="user" data-hovercard-url="/users/Puneeth-Aacharya/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/Puneeth-Aacharya"><img class="avatar avatar-user" src="./DBMS_QUERIES_files/68151137(2)" width="24" height="24" alt="@Puneeth-Aacharya"></a>
        </span>
        <div class="flex-1 d-flex flex-items-center ml-3 min-width-0">
          <div class="css-truncate css-truncate-overflow">
            <a class="text-bold Link--primary" rel="author" data-hovercard-type="user" data-hovercard-url="/users/Puneeth-Aacharya/hovercard" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="https://github.com/Puneeth-Aacharya">Puneeth-Aacharya</a>

                <span class="markdown-title">
                  <a data-pjax="true" title="Add files via upload" class="Link--secondary" href="https://github.com/Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM/commit/37678897d3384e0a2a1ef4447f1c0eb742acdd34">Add files via upload</a>
                </span>
          </div>


          <span class="ml-2">
            
          </span>
        </div>
        <div class="ml-3 d-flex flex-shrink-0 flex-items-center flex-justify-end color-text-secondary no-wrap">
          <span class="d-none d-md-inline">
            <span>Latest commit</span>
            <a class="text-small text-mono Link--secondary" href="https://github.com/Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM/commit/37678897d3384e0a2a1ef4447f1c0eb742acdd34" data-pjax="">3767889</a>
            <span itemprop="dateModified"><relative-time datetime="2021-02-04T04:08:25Z" class="no-wrap" title="Feb 4, 2021, 9:38 AM GMT+5:30">on Feb 4</relative-time></span>
          </span>

          <a data-pjax="" href="https://github.com/Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM/commits/main/DBMS_QUERIES.sql" class="ml-3 no-wrap Link--primary no-underline">
            <svg class="octicon octicon-history text-gray" height="16" viewBox="0 0 16 16" version="1.1" width="16" aria-hidden="true"><path fill-rule="evenodd" d="M1.643 3.143L.427 1.927A.25.25 0 000 2.104V5.75c0 .138.112.25.25.25h3.646a.25.25 0 00.177-.427L2.715 4.215a6.5 6.5 0 11-1.18 4.458.75.75 0 10-1.493.154 8.001 8.001 0 101.6-5.684zM7.75 4a.75.75 0 01.75.75v2.992l2.028.812a.75.75 0 01-.557 1.392l-2.5-1A.75.75 0 017 8.25v-3.5A.75.75 0 017.75 4z"></path></svg>
            <span class="d-none d-sm-inline">
              <strong>History</strong>
            </span>
          </a>
        </div>
      </div>

  </div>

  <div class="Box-body d-flex flex-items-center flex-auto border-bottom-0 flex-wrap">
    <details class="details-reset details-overlay details-overlay-dark lh-default color-text-primary float-left mr-3" id="blob_contributors_box">
      <summary class="Link--primary" role="button">
        <svg class="octicon octicon-people text-gray" height="16" viewBox="0 0 16 16" version="1.1" width="16" aria-hidden="true"><path fill-rule="evenodd" d="M5.5 3.5a2 2 0 100 4 2 2 0 000-4zM2 5.5a3.5 3.5 0 115.898 2.549 5.507 5.507 0 013.034 4.084.75.75 0 11-1.482.235 4.001 4.001 0 00-7.9 0 .75.75 0 01-1.482-.236A5.507 5.507 0 013.102 8.05 3.49 3.49 0 012 5.5zM11 4a.75.75 0 100 1.5 1.5 1.5 0 01.666 2.844.75.75 0 00-.416.672v.352a.75.75 0 00.574.73c1.2.289 2.162 1.2 2.522 2.372a.75.75 0 101.434-.44 5.01 5.01 0 00-2.56-3.012A3 3 0 0011 4z"></path></svg>
        <strong>1</strong>
        
        contributor
      </summary>
      <details-dialog class="Box Box--overlay d-flex flex-column anim-fade-in fast" aria-label="Users who have contributed to this file" src="/Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM/contributors-list/main/DBMS_QUERIES.sql" preload="" role="dialog" aria-modal="true">
        <div class="Box-header">
          <button class="Box-btn-octicon btn-octicon float-right" type="button" aria-label="Close dialog" data-close-dialog="">
            <svg class="octicon octicon-x" height="16" viewBox="0 0 16 16" version="1.1" width="16" aria-hidden="true"><path fill-rule="evenodd" d="M3.72 3.72a.75.75 0 011.06 0L8 6.94l3.22-3.22a.75.75 0 111.06 1.06L9.06 8l3.22 3.22a.75.75 0 11-1.06 1.06L8 9.06l-3.22 3.22a.75.75 0 01-1.06-1.06L6.94 8 3.72 4.78a.75.75 0 010-1.06z"></path></svg>
          </button>
          <h3 class="Box-title">
            Users who have contributed to this file
          </h3>
        </div>
        <include-fragment>
          <svg style="box-sizing: content-box; color: var(--color-icon-primary);" viewBox="0 0 16 16" fill="none" width="32" height="32" class="my-3 mx-auto d-block anim-rotate">
  <circle cx="8" cy="8" r="7" stroke="currentColor" stroke-opacity="0.25" stroke-width="2" vector-effect="non-scaling-stroke"></circle>
  <path d="M15 8a7.002 7.002 0 00-7-7" stroke="currentColor" stroke-width="2" stroke-linecap="round" vector-effect="non-scaling-stroke"></path>
</svg>
        </include-fragment>
      </details-dialog>
    </details>
  </div>
    </div>




      







  
    <div data-target="readme-toc.content" class="Box mt-3 position-relative
    ">
      
  <div class="Box-header py-2 pr-2 d-flex flex-shrink-0 flex-md-row flex-items-center">


  <div class="text-mono f6 flex-auto pr-3 flex-order-2 flex-md-order-1">

      182 lines (143 sloc)
      <span class="file-info-divider"></span>
    4.29 KB
  </div>

  <div class="d-flex py-1 py-md-0 flex-auto flex-order-1 flex-md-order-2 flex-sm-grow-0 flex-justify-between hide-sm hide-md">

    <div class="BtnGroup">
      <a href="https://github.com/Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM/raw/main/DBMS_QUERIES.sql" id="raw-url" role="button" class="btn-sm btn BtnGroup-item ">Raw</a>
        <a href="https://github.com/Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM/blame/main/DBMS_QUERIES.sql" data-hotkey="b" role="button" class="js-update-url-with-hash btn-sm btn BtnGroup-item ">Blame</a>
    </div>

    <div>
          <a class="btn-octicon tooltipped tooltipped-nw js-remove-unless-platform" data-platforms="windows,mac" href="https://desktop.github.com/" aria-label="Open this file in GitHub Desktop" data-ga-click="Repository, open with desktop">
              <svg class="octicon octicon-device-desktop" height="16" viewBox="0 0 16 16" version="1.1" width="16" aria-hidden="true"><path fill-rule="evenodd" d="M1.75 2.5h12.5a.25.25 0 01.25.25v7.5a.25.25 0 01-.25.25H1.75a.25.25 0 01-.25-.25v-7.5a.25.25 0 01.25-.25zM14.25 1H1.75A1.75 1.75 0 000 2.75v7.5C0 11.216.784 12 1.75 12h3.727c-.1 1.041-.52 1.872-1.292 2.757A.75.75 0 004.75 16h6.5a.75.75 0 00.565-1.243c-.772-.885-1.193-1.716-1.292-2.757h3.727A1.75 1.75 0 0016 10.25v-7.5A1.75 1.75 0 0014.25 1zM9.018 12H6.982a5.72 5.72 0 01-.765 2.5h3.566a5.72 5.72 0 01-.765-2.5z"></path></svg>
          </a>

          <!-- '"` --><!-- </textarea></xmp> --><form class="inline-form js-update-url-with-hash" action="https://github.com/Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM/edit/main/DBMS_QUERIES.sql" accept-charset="UTF-8" method="post"><input type="hidden" name="authenticity_token" value="AZ13niT+RB94c4vj76dAq5CfTRvhkj50BNdLhKNcMQ9Szgx3EpyOrCbazhoQ/fq2FgD8QdVivBjkEa7NrQYxFg==">
            <button class="btn-octicon tooltipped tooltipped-nw" type="submit" aria-label="Edit this file" data-hotkey="e" data-disable-with="">
              <svg class="octicon octicon-pencil" height="16" viewBox="0 0 16 16" version="1.1" width="16" aria-hidden="true"><path fill-rule="evenodd" d="M11.013 1.427a1.75 1.75 0 012.474 0l1.086 1.086a1.75 1.75 0 010 2.474l-8.61 8.61c-.21.21-.47.364-.756.445l-3.251.93a.75.75 0 01-.927-.928l.929-3.25a1.75 1.75 0 01.445-.758l8.61-8.61zm1.414 1.06a.25.25 0 00-.354 0L10.811 3.75l1.439 1.44 1.263-1.263a.25.25 0 000-.354l-1.086-1.086zM11.189 6.25L9.75 4.81l-6.286 6.287a.25.25 0 00-.064.108l-.558 1.953 1.953-.558a.249.249 0 00.108-.064l6.286-6.286z"></path></svg>
            </button>
</form>
          <!-- '"` --><!-- </textarea></xmp> --><form class="inline-form" action="https://github.com/Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM/delete/main/DBMS_QUERIES.sql" accept-charset="UTF-8" method="post"><input type="hidden" name="authenticity_token" value="crodC4iMGW48GqI3ogDPfBxcqtLaYPawOh5Xyyxo4KdVzLBeIyfrKU1Z21FyzX63bgQD3KSLwoNzs2caPMNVyQ==">
            <button class="btn-octicon btn-octicon-danger tooltipped tooltipped-nw" type="submit" aria-label="Delete this file" data-disable-with="">
              <svg class="octicon octicon-trash" height="16" viewBox="0 0 16 16" version="1.1" width="16" aria-hidden="true"><path fill-rule="evenodd" d="M6.5 1.75a.25.25 0 01.25-.25h2.5a.25.25 0 01.25.25V3h-3V1.75zm4.5 0V3h2.25a.75.75 0 010 1.5H2.75a.75.75 0 010-1.5H5V1.75C5 .784 5.784 0 6.75 0h2.5C10.216 0 11 .784 11 1.75zM4.496 6.675a.75.75 0 10-1.492.15l.66 6.6A1.75 1.75 0 005.405 15h5.19c.9 0 1.652-.681 1.741-1.576l.66-6.6a.75.75 0 00-1.492-.149l-.66 6.6a.25.25 0 01-.249.225h-5.19a.25.25 0 01-.249-.225l-.66-6.6z"></path></svg>
            </button>
</form>    </div>
  </div>

    <div class="d-flex hide-lg hide-xl flex-order-2 flex-grow-0">
      <details class="dropdown details-reset details-overlay d-inline-block">
        <summary class="btn-octicon" aria-haspopup="true" aria-label="possible actions">
          <svg height="16" class="octicon octicon-kebab-horizontal" viewBox="0 0 16 16" version="1.1" width="16" aria-hidden="true"><path d="M8 9a1.5 1.5 0 100-3 1.5 1.5 0 000 3zM1.5 9a1.5 1.5 0 100-3 1.5 1.5 0 000 3zm13 0a1.5 1.5 0 100-3 1.5 1.5 0 000 3z"></path></svg>
        </summary>

        <ul class="dropdown-menu dropdown-menu-sw">
            <li>
                <a class="dropdown-item tooltipped tooltipped-nw js-remove-unless-platform" data-platforms="windows,mac" href="https://desktop.github.com/" data-ga-click="Repository, open with desktop">
                  Open with Desktop
                </a>
            </li>
          <li>
            <a class="dropdown-item" href="https://github.com/Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM/raw/main/DBMS_QUERIES.sql">
              View raw
            </a>
          </li>
            <li>
              <a class="dropdown-item" href="https://github.com/Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM/blame/main/DBMS_QUERIES.sql">
                View blame
              </a>
            </li>

              <li class="dropdown-divider" role="none"></li>
              <li>
                <a class="dropdown-item" href="https://github.com/Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM/edit/main/DBMS_QUERIES.sql">Edit file</a>
              </li>
              <li>
                <a class="dropdown-item menu-item-danger" href="https://github.com/Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM/delete/main/DBMS_QUERIES.sql">Delete file</a>
              </li>
        </ul>
      </details>
    </div>
</div>


      
  <div itemprop="text" class="Box-body p-0 blob-wrapper data type-sql  gist-border-0">
      
<table class="highlight tab-size js-file-line-container" data-tab-size="8" data-paste-markdown-skip="">
      <tbody><tr>
        <td id="L1" class="blob-num js-line-number" data-line-number="1"></td>
        <td id="LC1" class="blob-code blob-code-inner js-file-line"><span class="pl-k">CREATE</span> <span class="pl-k">TABLE</span>  <span class="pl-en">ADMINISTRATION</span></td>
      </tr>
      <tr>
        <td id="L2" class="blob-num js-line-number" data-line-number="2"></td>
        <td id="LC2" class="blob-code blob-code-inner js-file-line">   (	A_ID <span class="pl-k">VARCHAR2</span>(<span class="pl-c1">8</span>), </td>
      </tr>
      <tr>
        <td id="L3" class="blob-num js-line-number" data-line-number="3"></td>
        <td id="LC3" class="blob-code blob-code-inner js-file-line">	A_NAME <span class="pl-k">VARCHAR2</span>(<span class="pl-c1">25</span>), </td>
      </tr>
      <tr>
        <td id="L4" class="blob-num js-line-number" data-line-number="4"></td>
        <td id="LC4" class="blob-code blob-code-inner js-file-line">	ADDRESS <span class="pl-k">VARCHAR2</span>(<span class="pl-c1">20</span>), </td>
      </tr>
      <tr>
        <td id="L5" class="blob-num js-line-number" data-line-number="5"></td>
        <td id="LC5" class="blob-code blob-code-inner js-file-line">	DESIGNATION <span class="pl-k">VARCHAR2</span>(<span class="pl-c1">40</span>), </td>
      </tr>
      <tr>
        <td id="L6" class="blob-num js-line-number" data-line-number="6"></td>
        <td id="LC6" class="blob-code blob-code-inner js-file-line">	QUALIFICATION <span class="pl-k">VARCHAR2</span>(<span class="pl-c1">20</span>), </td>
      </tr>
      <tr>
        <td id="L7" class="blob-num js-line-number" data-line-number="7"></td>
        <td id="LC7" class="blob-code blob-code-inner js-file-line">	PH_NO <span class="pl-k">NUMBER</span>(<span class="pl-c1">10</span>,<span class="pl-c1">0</span>), </td>
      </tr>
      <tr>
        <td id="L8" class="blob-num js-line-number" data-line-number="8"></td>
        <td id="LC8" class="blob-code blob-code-inner js-file-line">	BLOOD_GROUP <span class="pl-k">VARCHAR2</span>(<span class="pl-c1">3</span>), </td>
      </tr>
      <tr>
        <td id="L9" class="blob-num js-line-number" data-line-number="9"></td>
        <td id="LC9" class="blob-code blob-code-inner js-file-line">	YEAR_OF_EXP <span class="pl-k">NUMBER</span>(<span class="pl-c1">2</span>,<span class="pl-c1">0</span>), </td>
      </tr>
      <tr>
        <td id="L10" class="blob-num js-line-number" data-line-number="10"></td>
        <td id="LC10" class="blob-code blob-code-inner js-file-line">	PASSWORD <span class="pl-k">VARCHAR2</span>(<span class="pl-c1">12</span>), </td>
      </tr>
      <tr>
        <td id="L11" class="blob-num js-line-number" data-line-number="11"></td>
        <td id="LC11" class="blob-code blob-code-inner js-file-line">	 <span class="pl-k">PRIMARY KEY</span> (A_ID) </td>
      </tr>
      <tr>
        <td id="L12" class="blob-num js-line-number" data-line-number="12"></td>
        <td id="LC12" class="blob-code blob-code-inner js-file-line">   );</td>
      </tr>
      <tr>
        <td id="L13" class="blob-num js-line-number" data-line-number="13"></td>
        <td id="LC13" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L14" class="blob-num js-line-number" data-line-number="14"></td>
        <td id="LC14" class="blob-code blob-code-inner js-file-line"><span class="pl-k">CREATE</span> <span class="pl-k">TABLE</span>  <span class="pl-en">BILLING</span> </td>
      </tr>
      <tr>
        <td id="L15" class="blob-num js-line-number" data-line-number="15"></td>
        <td id="LC15" class="blob-code blob-code-inner js-file-line">   (	BILL_NUMBER <span class="pl-k">NUMBER</span>, </td>
      </tr>
      <tr>
        <td id="L16" class="blob-num js-line-number" data-line-number="16"></td>
        <td id="LC16" class="blob-code blob-code-inner js-file-line">	P_ID <span class="pl-k">VARCHAR2</span>(<span class="pl-c1">8</span>) <span class="pl-k">NOT NULL</span> , </td>
      </tr>
      <tr>
        <td id="L17" class="blob-num js-line-number" data-line-number="17"></td>
        <td id="LC17" class="blob-code blob-code-inner js-file-line">	P_NAME <span class="pl-k">VARCHAR2</span>(<span class="pl-c1">20</span>), </td>
      </tr>
      <tr>
        <td id="L18" class="blob-num js-line-number" data-line-number="18"></td>
        <td id="LC18" class="blob-code blob-code-inner js-file-line">	P_TYPE <span class="pl-k">VARCHAR2</span>(<span class="pl-c1">20</span>), </td>
      </tr>
      <tr>
        <td id="L19" class="blob-num js-line-number" data-line-number="19"></td>
        <td id="LC19" class="blob-code blob-code-inner js-file-line">	DOCTOR_CHARGES <span class="pl-k">NUMBER</span>, </td>
      </tr>
      <tr>
        <td id="L20" class="blob-num js-line-number" data-line-number="20"></td>
        <td id="LC20" class="blob-code blob-code-inner js-file-line">	LAB_CHARGES <span class="pl-k">NUMBER</span>, </td>
      </tr>
      <tr>
        <td id="L21" class="blob-num js-line-number" data-line-number="21"></td>
        <td id="LC21" class="blob-code blob-code-inner js-file-line">	WARD_CHARGES <span class="pl-k">NUMBER</span>, </td>
      </tr>
      <tr>
        <td id="L22" class="blob-num js-line-number" data-line-number="22"></td>
        <td id="LC22" class="blob-code blob-code-inner js-file-line">	NO_OF_DAYS <span class="pl-k">NUMBER</span>, </td>
      </tr>
      <tr>
        <td id="L23" class="blob-num js-line-number" data-line-number="23"></td>
        <td id="LC23" class="blob-code blob-code-inner js-file-line">	OTHER_CHARGES <span class="pl-k">NUMBER</span>, </td>
      </tr>
      <tr>
        <td id="L24" class="blob-num js-line-number" data-line-number="24"></td>
        <td id="LC24" class="blob-code blob-code-inner js-file-line">	TOTAL <span class="pl-k">NUMBER</span>, </td>
      </tr>
      <tr>
        <td id="L25" class="blob-num js-line-number" data-line-number="25"></td>
        <td id="LC25" class="blob-code blob-code-inner js-file-line">	<span class="pl-c1">CURRENT_DATE</span> <span class="pl-k">DATE</span> <span class="pl-k">NOT NULL</span> , </td>
      </tr>
      <tr>
        <td id="L26" class="blob-num js-line-number" data-line-number="26"></td>
        <td id="LC26" class="blob-code blob-code-inner js-file-line">	 <span class="pl-k">CONSTRAINT</span> <span class="pl-s"><span class="pl-pds">"</span>BILLING_PK<span class="pl-pds">"</span></span> <span class="pl-k">PRIMARY KEY</span> (<span class="pl-s"><span class="pl-pds">"</span>BILL_NUMBER<span class="pl-pds">"</span></span>) ENABLE, </td>
      </tr>
      <tr>
        <td id="L27" class="blob-num js-line-number" data-line-number="27"></td>
        <td id="LC27" class="blob-code blob-code-inner js-file-line">	 <span class="pl-k">CONSTRAINT</span> <span class="pl-s"><span class="pl-pds">"</span>BILLING_UK1<span class="pl-pds">"</span></span> UNIQUE (<span class="pl-s"><span class="pl-pds">"</span>P_ID<span class="pl-pds">"</span></span>) DISABLE, </td>
      </tr>
      <tr>
        <td id="L28" class="blob-num js-line-number" data-line-number="28"></td>
        <td id="LC28" class="blob-code blob-code-inner js-file-line">	 <span class="pl-k">CONSTRAINT</span> <span class="pl-s"><span class="pl-pds">"</span>BILLING_FK<span class="pl-pds">"</span></span> <span class="pl-k">FOREIGN KEY</span> (<span class="pl-s"><span class="pl-pds">"</span>P_ID<span class="pl-pds">"</span></span>)</td>
      </tr>
      <tr>
        <td id="L29" class="blob-num js-line-number" data-line-number="29"></td>
        <td id="LC29" class="blob-code blob-code-inner js-file-line">	  <span class="pl-k">REFERENCES</span>  <span class="pl-s"><span class="pl-pds">"</span>PATIENT<span class="pl-pds">"</span></span> (<span class="pl-s"><span class="pl-pds">"</span>P_ID<span class="pl-pds">"</span></span>) ENABLE</td>
      </tr>
      <tr>
        <td id="L30" class="blob-num js-line-number" data-line-number="30"></td>
        <td id="LC30" class="blob-code blob-code-inner js-file-line">   )</td>
      </tr>
      <tr>
        <td id="L31" class="blob-num js-line-number" data-line-number="31"></td>
        <td id="LC31" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L32" class="blob-num js-line-number" data-line-number="32"></td>
        <td id="LC32" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L33" class="blob-num js-line-number" data-line-number="33"></td>
        <td id="LC33" class="blob-code blob-code-inner js-file-line"><span class="pl-k">CREATE</span> <span class="pl-k">TABLE</span>  "<span class="pl-en">DOCTOR</span>" </td>
      </tr>
      <tr>
        <td id="L34" class="blob-num js-line-number" data-line-number="34"></td>
        <td id="LC34" class="blob-code blob-code-inner js-file-line">   (	<span class="pl-s"><span class="pl-pds">"</span>D_ID<span class="pl-pds">"</span></span> <span class="pl-k">VARCHAR2</span>(<span class="pl-c1">8</span>), </td>
      </tr>
      <tr>
        <td id="L35" class="blob-num js-line-number" data-line-number="35"></td>
        <td id="LC35" class="blob-code blob-code-inner js-file-line">	<span class="pl-s"><span class="pl-pds">"</span>D_NAME<span class="pl-pds">"</span></span> <span class="pl-k">VARCHAR2</span>(<span class="pl-c1">25</span>), </td>
      </tr>
      <tr>
        <td id="L36" class="blob-num js-line-number" data-line-number="36"></td>
        <td id="LC36" class="blob-code blob-code-inner js-file-line">	<span class="pl-s"><span class="pl-pds">"</span>DEPARTMENT<span class="pl-pds">"</span></span> <span class="pl-k">VARCHAR2</span>(<span class="pl-c1">20</span>), </td>
      </tr>
      <tr>
        <td id="L37" class="blob-num js-line-number" data-line-number="37"></td>
        <td id="LC37" class="blob-code blob-code-inner js-file-line">	<span class="pl-s"><span class="pl-pds">"</span>AGE<span class="pl-pds">"</span></span> <span class="pl-k">NUMBER</span>(<span class="pl-c1">2</span>,<span class="pl-c1">0</span>), </td>
      </tr>
      <tr>
        <td id="L38" class="blob-num js-line-number" data-line-number="38"></td>
        <td id="LC38" class="blob-code blob-code-inner js-file-line">	<span class="pl-s"><span class="pl-pds">"</span>GENDER<span class="pl-pds">"</span></span> <span class="pl-k">CHAR</span>(<span class="pl-c1">1</span>), </td>
      </tr>
      <tr>
        <td id="L39" class="blob-num js-line-number" data-line-number="39"></td>
        <td id="LC39" class="blob-code blob-code-inner js-file-line">	<span class="pl-s"><span class="pl-pds">"</span>ADDRESS<span class="pl-pds">"</span></span> <span class="pl-k">VARCHAR2</span>(<span class="pl-c1">25</span>), </td>
      </tr>
      <tr>
        <td id="L40" class="blob-num js-line-number" data-line-number="40"></td>
        <td id="LC40" class="blob-code blob-code-inner js-file-line">	<span class="pl-s"><span class="pl-pds">"</span>SALARY<span class="pl-pds">"</span></span> <span class="pl-k">NUMBER</span>, </td>
      </tr>
      <tr>
        <td id="L41" class="blob-num js-line-number" data-line-number="41"></td>
        <td id="LC41" class="blob-code blob-code-inner js-file-line">	<span class="pl-s"><span class="pl-pds">"</span>PH_NO<span class="pl-pds">"</span></span> <span class="pl-k">NUMBER</span>(<span class="pl-c1">10</span>,<span class="pl-c1">0</span>), </td>
      </tr>
      <tr>
        <td id="L42" class="blob-num js-line-number" data-line-number="42"></td>
        <td id="LC42" class="blob-code blob-code-inner js-file-line">	<span class="pl-s"><span class="pl-pds">"</span>BLOOD_GROUP<span class="pl-pds">"</span></span> <span class="pl-k">VARCHAR2</span>(<span class="pl-c1">3</span>), </td>
      </tr>
      <tr>
        <td id="L43" class="blob-num js-line-number" data-line-number="43"></td>
        <td id="LC43" class="blob-code blob-code-inner js-file-line">	<span class="pl-s"><span class="pl-pds">"</span>PASSWORD<span class="pl-pds">"</span></span> <span class="pl-k">VARCHAR2</span>(<span class="pl-c1">12</span>), </td>
      </tr>
      <tr>
        <td id="L44" class="blob-num js-line-number" data-line-number="44"></td>
        <td id="LC44" class="blob-code blob-code-inner js-file-line">	 <span class="pl-k">PRIMARY KEY</span> (<span class="pl-s"><span class="pl-pds">"</span>D_ID<span class="pl-pds">"</span></span>) ENABLE</td>
      </tr>
      <tr>
        <td id="L45" class="blob-num js-line-number" data-line-number="45"></td>
        <td id="LC45" class="blob-code blob-code-inner js-file-line">   )</td>
      </tr>
      <tr>
        <td id="L46" class="blob-num js-line-number" data-line-number="46"></td>
        <td id="LC46" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L47" class="blob-num js-line-number" data-line-number="47"></td>
        <td id="LC47" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L48" class="blob-num js-line-number" data-line-number="48"></td>
        <td id="LC48" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L49" class="blob-num js-line-number" data-line-number="49"></td>
        <td id="LC49" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L50" class="blob-num js-line-number" data-line-number="50"></td>
        <td id="LC50" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L51" class="blob-num js-line-number" data-line-number="51"></td>
        <td id="LC51" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L52" class="blob-num js-line-number" data-line-number="52"></td>
        <td id="LC52" class="blob-code blob-code-inner js-file-line"><span class="pl-k">CREATE</span> <span class="pl-k">TABLE</span>  "<span class="pl-en">INPATIENT</span>" </td>
      </tr>
      <tr>
        <td id="L53" class="blob-num js-line-number" data-line-number="53"></td>
        <td id="LC53" class="blob-code blob-code-inner js-file-line">   (	<span class="pl-s"><span class="pl-pds">"</span>P_ID<span class="pl-pds">"</span></span> <span class="pl-k">VARCHAR2</span>(<span class="pl-c1">8</span>) <span class="pl-k">NOT NULL</span> ENABLE, </td>
      </tr>
      <tr>
        <td id="L54" class="blob-num js-line-number" data-line-number="54"></td>
        <td id="LC54" class="blob-code blob-code-inner js-file-line">	<span class="pl-s"><span class="pl-pds">"</span>P_NAME<span class="pl-pds">"</span></span> <span class="pl-k">VARCHAR2</span>(<span class="pl-c1">20</span>), </td>
      </tr>
      <tr>
        <td id="L55" class="blob-num js-line-number" data-line-number="55"></td>
        <td id="LC55" class="blob-code blob-code-inner js-file-line">	<span class="pl-s"><span class="pl-pds">"</span>WARD_NO<span class="pl-pds">"</span></span> <span class="pl-k">NUMBER</span>, </td>
      </tr>
      <tr>
        <td id="L56" class="blob-num js-line-number" data-line-number="56"></td>
        <td id="LC56" class="blob-code blob-code-inner js-file-line">	<span class="pl-s"><span class="pl-pds">"</span>DATE_OF_ADMISSION<span class="pl-pds">"</span></span> <span class="pl-k">DATE</span> <span class="pl-k">NOT NULL</span> ENABLE, </td>
      </tr>
      <tr>
        <td id="L57" class="blob-num js-line-number" data-line-number="57"></td>
        <td id="LC57" class="blob-code blob-code-inner js-file-line">	<span class="pl-s"><span class="pl-pds">"</span>DATE_OF_DISCHARGE<span class="pl-pds">"</span></span> <span class="pl-k">DATE</span>, </td>
      </tr>
      <tr>
        <td id="L58" class="blob-num js-line-number" data-line-number="58"></td>
        <td id="LC58" class="blob-code blob-code-inner js-file-line">	<span class="pl-s"><span class="pl-pds">"</span>LAB_NO<span class="pl-pds">"</span></span> <span class="pl-k">NUMBER</span>, </td>
      </tr>
      <tr>
        <td id="L59" class="blob-num js-line-number" data-line-number="59"></td>
        <td id="LC59" class="blob-code blob-code-inner js-file-line">	<span class="pl-s"><span class="pl-pds">"</span>N_ID<span class="pl-pds">"</span></span> <span class="pl-k">VARCHAR2</span>(<span class="pl-c1">8</span>), </td>
      </tr>
      <tr>
        <td id="L60" class="blob-num js-line-number" data-line-number="60"></td>
        <td id="LC60" class="blob-code blob-code-inner js-file-line">	<span class="pl-s"><span class="pl-pds">"</span>D_ID<span class="pl-pds">"</span></span> <span class="pl-k">VARCHAR2</span>(<span class="pl-c1">8</span>), </td>
      </tr>
      <tr>
        <td id="L61" class="blob-num js-line-number" data-line-number="61"></td>
        <td id="LC61" class="blob-code blob-code-inner js-file-line">	<span class="pl-s"><span class="pl-pds">"</span>PH_NO<span class="pl-pds">"</span></span> <span class="pl-k">NUMBER</span>(<span class="pl-c1">10</span>,<span class="pl-c1">0</span>), </td>
      </tr>
      <tr>
        <td id="L62" class="blob-num js-line-number" data-line-number="62"></td>
        <td id="LC62" class="blob-code blob-code-inner js-file-line">	<span class="pl-s"><span class="pl-pds">"</span>DISEASE<span class="pl-pds">"</span></span> <span class="pl-k">VARCHAR2</span>(<span class="pl-c1">30</span>), </td>
      </tr>
      <tr>
        <td id="L63" class="blob-num js-line-number" data-line-number="63"></td>
        <td id="LC63" class="blob-code blob-code-inner js-file-line">	 <span class="pl-k">CONSTRAINT</span> <span class="pl-s"><span class="pl-pds">"</span>INPATIENT_CON<span class="pl-pds">"</span></span> UNIQUE (<span class="pl-s"><span class="pl-pds">"</span>P_ID<span class="pl-pds">"</span></span>) ENABLE, </td>
      </tr>
      <tr>
        <td id="L64" class="blob-num js-line-number" data-line-number="64"></td>
        <td id="LC64" class="blob-code blob-code-inner js-file-line">	 <span class="pl-k">CONSTRAINT</span> <span class="pl-s"><span class="pl-pds">"</span>INPATIENT_FK<span class="pl-pds">"</span></span> <span class="pl-k">FOREIGN KEY</span> (<span class="pl-s"><span class="pl-pds">"</span>P_ID<span class="pl-pds">"</span></span>)</td>
      </tr>
      <tr>
        <td id="L65" class="blob-num js-line-number" data-line-number="65"></td>
        <td id="LC65" class="blob-code blob-code-inner js-file-line">	  <span class="pl-k">REFERENCES</span>  <span class="pl-s"><span class="pl-pds">"</span>PATIENT<span class="pl-pds">"</span></span> (<span class="pl-s"><span class="pl-pds">"</span>P_ID<span class="pl-pds">"</span></span>) ENABLE, </td>
      </tr>
      <tr>
        <td id="L66" class="blob-num js-line-number" data-line-number="66"></td>
        <td id="LC66" class="blob-code blob-code-inner js-file-line">	 <span class="pl-k">CONSTRAINT</span> <span class="pl-s"><span class="pl-pds">"</span>INPATIENT_FK2<span class="pl-pds">"</span></span> <span class="pl-k">FOREIGN KEY</span> (<span class="pl-s"><span class="pl-pds">"</span>WARD_NO<span class="pl-pds">"</span></span>)</td>
      </tr>
      <tr>
        <td id="L67" class="blob-num js-line-number" data-line-number="67"></td>
        <td id="LC67" class="blob-code blob-code-inner js-file-line">	  <span class="pl-k">REFERENCES</span>  <span class="pl-s"><span class="pl-pds">"</span>WARDS<span class="pl-pds">"</span></span> (<span class="pl-s"><span class="pl-pds">"</span>WARD_NO<span class="pl-pds">"</span></span>) ENABLE, </td>
      </tr>
      <tr>
        <td id="L68" class="blob-num js-line-number" data-line-number="68"></td>
        <td id="LC68" class="blob-code blob-code-inner js-file-line">	 <span class="pl-k">CONSTRAINT</span> <span class="pl-s"><span class="pl-pds">"</span>INPATIENT_FK3<span class="pl-pds">"</span></span> <span class="pl-k">FOREIGN KEY</span> (<span class="pl-s"><span class="pl-pds">"</span>LAB_NO<span class="pl-pds">"</span></span>)</td>
      </tr>
      <tr>
        <td id="L69" class="blob-num js-line-number" data-line-number="69"></td>
        <td id="LC69" class="blob-code blob-code-inner js-file-line">	  <span class="pl-k">REFERENCES</span>  <span class="pl-s"><span class="pl-pds">"</span>LAB<span class="pl-pds">"</span></span> (<span class="pl-s"><span class="pl-pds">"</span>LAB_NO<span class="pl-pds">"</span></span>) ENABLE, </td>
      </tr>
      <tr>
        <td id="L70" class="blob-num js-line-number" data-line-number="70"></td>
        <td id="LC70" class="blob-code blob-code-inner js-file-line">	 <span class="pl-k">CONSTRAINT</span> <span class="pl-s"><span class="pl-pds">"</span>INPATIENT_FK4<span class="pl-pds">"</span></span> <span class="pl-k">FOREIGN KEY</span> (<span class="pl-s"><span class="pl-pds">"</span>N_ID<span class="pl-pds">"</span></span>)</td>
      </tr>
      <tr>
        <td id="L71" class="blob-num js-line-number" data-line-number="71"></td>
        <td id="LC71" class="blob-code blob-code-inner js-file-line">	  <span class="pl-k">REFERENCES</span>  <span class="pl-s"><span class="pl-pds">"</span>NURSE<span class="pl-pds">"</span></span> (<span class="pl-s"><span class="pl-pds">"</span>N_ID<span class="pl-pds">"</span></span>) ENABLE, </td>
      </tr>
      <tr>
        <td id="L72" class="blob-num js-line-number" data-line-number="72"></td>
        <td id="LC72" class="blob-code blob-code-inner js-file-line">	 <span class="pl-k">CONSTRAINT</span> <span class="pl-s"><span class="pl-pds">"</span>INPATIENT_FK5<span class="pl-pds">"</span></span> <span class="pl-k">FOREIGN KEY</span> (<span class="pl-s"><span class="pl-pds">"</span>D_ID<span class="pl-pds">"</span></span>)</td>
      </tr>
      <tr>
        <td id="L73" class="blob-num js-line-number" data-line-number="73"></td>
        <td id="LC73" class="blob-code blob-code-inner js-file-line">	  <span class="pl-k">REFERENCES</span>  <span class="pl-s"><span class="pl-pds">"</span>DOCTOR<span class="pl-pds">"</span></span> (<span class="pl-s"><span class="pl-pds">"</span>D_ID<span class="pl-pds">"</span></span>) ENABLE</td>
      </tr>
      <tr>
        <td id="L74" class="blob-num js-line-number" data-line-number="74"></td>
        <td id="LC74" class="blob-code blob-code-inner js-file-line">   )</td>
      </tr>
      <tr>
        <td id="L75" class="blob-num js-line-number" data-line-number="75"></td>
        <td id="LC75" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L76" class="blob-num js-line-number" data-line-number="76"></td>
        <td id="LC76" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L77" class="blob-num js-line-number" data-line-number="77"></td>
        <td id="LC77" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L78" class="blob-num js-line-number" data-line-number="78"></td>
        <td id="LC78" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L79" class="blob-num js-line-number" data-line-number="79"></td>
        <td id="LC79" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L80" class="blob-num js-line-number" data-line-number="80"></td>
        <td id="LC80" class="blob-code blob-code-inner js-file-line"><span class="pl-k">CREATE</span> <span class="pl-k">TABLE</span>  "<span class="pl-en">LAB</span>" </td>
      </tr>
      <tr>
        <td id="L81" class="blob-num js-line-number" data-line-number="81"></td>
        <td id="LC81" class="blob-code blob-code-inner js-file-line">   (	<span class="pl-s"><span class="pl-pds">"</span>LAB_NO<span class="pl-pds">"</span></span> <span class="pl-k">NUMBER</span>, </td>
      </tr>
      <tr>
        <td id="L82" class="blob-num js-line-number" data-line-number="82"></td>
        <td id="LC82" class="blob-code blob-code-inner js-file-line">	<span class="pl-s"><span class="pl-pds">"</span>LAB_TYPE<span class="pl-pds">"</span></span> <span class="pl-k">VARCHAR2</span>(<span class="pl-c1">30</span>), </td>
      </tr>
      <tr>
        <td id="L83" class="blob-num js-line-number" data-line-number="83"></td>
        <td id="LC83" class="blob-code blob-code-inner js-file-line">	 <span class="pl-k">CONSTRAINT</span> <span class="pl-s"><span class="pl-pds">"</span>LAB_PK<span class="pl-pds">"</span></span> <span class="pl-k">PRIMARY KEY</span> (<span class="pl-s"><span class="pl-pds">"</span>LAB_NO<span class="pl-pds">"</span></span>) ENABLE</td>
      </tr>
      <tr>
        <td id="L84" class="blob-num js-line-number" data-line-number="84"></td>
        <td id="LC84" class="blob-code blob-code-inner js-file-line">   )</td>
      </tr>
      <tr>
        <td id="L85" class="blob-num js-line-number" data-line-number="85"></td>
        <td id="LC85" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L86" class="blob-num js-line-number" data-line-number="86"></td>
        <td id="LC86" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L87" class="blob-num js-line-number" data-line-number="87"></td>
        <td id="LC87" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L88" class="blob-num js-line-number" data-line-number="88"></td>
        <td id="LC88" class="blob-code blob-code-inner js-file-line"><span class="pl-k">CREATE</span> <span class="pl-k">TABLE</span>  "<span class="pl-en">NURSE</span>" </td>
      </tr>
      <tr>
        <td id="L89" class="blob-num js-line-number" data-line-number="89"></td>
        <td id="LC89" class="blob-code blob-code-inner js-file-line">   (	<span class="pl-s"><span class="pl-pds">"</span>N_ID<span class="pl-pds">"</span></span> <span class="pl-k">VARCHAR2</span>(<span class="pl-c1">8</span>), </td>
      </tr>
      <tr>
        <td id="L90" class="blob-num js-line-number" data-line-number="90"></td>
        <td id="LC90" class="blob-code blob-code-inner js-file-line">	<span class="pl-s"><span class="pl-pds">"</span>N_NAME<span class="pl-pds">"</span></span> <span class="pl-k">VARCHAR2</span>(<span class="pl-c1">25</span>), </td>
      </tr>
      <tr>
        <td id="L91" class="blob-num js-line-number" data-line-number="91"></td>
        <td id="LC91" class="blob-code blob-code-inner js-file-line">	<span class="pl-s"><span class="pl-pds">"</span>ADDRESS<span class="pl-pds">"</span></span> <span class="pl-k">VARCHAR2</span>(<span class="pl-c1">25</span>), </td>
      </tr>
      <tr>
        <td id="L92" class="blob-num js-line-number" data-line-number="92"></td>
        <td id="LC92" class="blob-code blob-code-inner js-file-line">	<span class="pl-s"><span class="pl-pds">"</span>SALARY<span class="pl-pds">"</span></span> <span class="pl-k">NUMBER</span>, </td>
      </tr>
      <tr>
        <td id="L93" class="blob-num js-line-number" data-line-number="93"></td>
        <td id="LC93" class="blob-code blob-code-inner js-file-line">	<span class="pl-s"><span class="pl-pds">"</span>BLOOD_GROUP<span class="pl-pds">"</span></span> <span class="pl-k">VARCHAR2</span>(<span class="pl-c1">3</span>), </td>
      </tr>
      <tr>
        <td id="L94" class="blob-num js-line-number" data-line-number="94"></td>
        <td id="LC94" class="blob-code blob-code-inner js-file-line">	<span class="pl-s"><span class="pl-pds">"</span>PASSWORD<span class="pl-pds">"</span></span> <span class="pl-k">VARCHAR2</span>(<span class="pl-c1">12</span>), </td>
      </tr>
      <tr>
        <td id="L95" class="blob-num js-line-number" data-line-number="95"></td>
        <td id="LC95" class="blob-code blob-code-inner js-file-line">	<span class="pl-s"><span class="pl-pds">"</span>PH_NO<span class="pl-pds">"</span></span> <span class="pl-k">NUMBER</span>(<span class="pl-c1">10</span>,<span class="pl-c1">0</span>), </td>
      </tr>
      <tr>
        <td id="L96" class="blob-num js-line-number" data-line-number="96"></td>
        <td id="LC96" class="blob-code blob-code-inner js-file-line">	 <span class="pl-k">PRIMARY KEY</span> (<span class="pl-s"><span class="pl-pds">"</span>N_ID<span class="pl-pds">"</span></span>) ENABLE</td>
      </tr>
      <tr>
        <td id="L97" class="blob-num js-line-number" data-line-number="97"></td>
        <td id="LC97" class="blob-code blob-code-inner js-file-line">   )</td>
      </tr>
      <tr>
        <td id="L98" class="blob-num js-line-number" data-line-number="98"></td>
        <td id="LC98" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L99" class="blob-num js-line-number" data-line-number="99"></td>
        <td id="LC99" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L100" class="blob-num js-line-number" data-line-number="100"></td>
        <td id="LC100" class="blob-code blob-code-inner js-file-line"><span class="pl-k">CREATE</span> <span class="pl-k">TABLE</span>  "<span class="pl-en">PATIENT</span>" </td>
      </tr>
      <tr>
        <td id="L101" class="blob-num js-line-number" data-line-number="101"></td>
        <td id="LC101" class="blob-code blob-code-inner js-file-line">   (	<span class="pl-s"><span class="pl-pds">"</span>P_ID<span class="pl-pds">"</span></span> <span class="pl-k">VARCHAR2</span>(<span class="pl-c1">8</span>), </td>
      </tr>
      <tr>
        <td id="L102" class="blob-num js-line-number" data-line-number="102"></td>
        <td id="LC102" class="blob-code blob-code-inner js-file-line">	<span class="pl-s"><span class="pl-pds">"</span>P_NAME<span class="pl-pds">"</span></span> <span class="pl-k">VARCHAR2</span>(<span class="pl-c1">20</span>), </td>
      </tr>
      <tr>
        <td id="L103" class="blob-num js-line-number" data-line-number="103"></td>
        <td id="LC103" class="blob-code blob-code-inner js-file-line">	<span class="pl-s"><span class="pl-pds">"</span>AGE<span class="pl-pds">"</span></span> <span class="pl-k">NUMBER</span>, </td>
      </tr>
      <tr>
        <td id="L104" class="blob-num js-line-number" data-line-number="104"></td>
        <td id="LC104" class="blob-code blob-code-inner js-file-line">	<span class="pl-s"><span class="pl-pds">"</span>GENDER<span class="pl-pds">"</span></span> <span class="pl-k">VARCHAR2</span>(<span class="pl-c1">6</span>), </td>
      </tr>
      <tr>
        <td id="L105" class="blob-num js-line-number" data-line-number="105"></td>
        <td id="LC105" class="blob-code blob-code-inner js-file-line">	<span class="pl-s"><span class="pl-pds">"</span>TIME<span class="pl-pds">"</span></span> <span class="pl-k">VARCHAR2</span>(<span class="pl-c1">30</span>) <span class="pl-k">NOT NULL</span> ENABLE, </td>
      </tr>
      <tr>
        <td id="L106" class="blob-num js-line-number" data-line-number="106"></td>
        <td id="LC106" class="blob-code blob-code-inner js-file-line">	<span class="pl-s"><span class="pl-pds">"</span>BLOOD_GROUP<span class="pl-pds">"</span></span> <span class="pl-k">VARCHAR2</span>(<span class="pl-c1">3</span>), </td>
      </tr>
      <tr>
        <td id="L107" class="blob-num js-line-number" data-line-number="107"></td>
        <td id="LC107" class="blob-code blob-code-inner js-file-line">	<span class="pl-s"><span class="pl-pds">"</span>ADDRESS<span class="pl-pds">"</span></span> <span class="pl-k">VARCHAR2</span>(<span class="pl-c1">25</span>), </td>
      </tr>
      <tr>
        <td id="L108" class="blob-num js-line-number" data-line-number="108"></td>
        <td id="LC108" class="blob-code blob-code-inner js-file-line">	<span class="pl-s"><span class="pl-pds">"</span>APPOINTMENT_DATE<span class="pl-pds">"</span></span> <span class="pl-k">DATE</span>, </td>
      </tr>
      <tr>
        <td id="L109" class="blob-num js-line-number" data-line-number="109"></td>
        <td id="LC109" class="blob-code blob-code-inner js-file-line">	<span class="pl-s"><span class="pl-pds">"</span>DOCTOR_ID<span class="pl-pds">"</span></span> <span class="pl-k">VARCHAR2</span>(<span class="pl-c1">8</span>) <span class="pl-k">NOT NULL</span> ENABLE, </td>
      </tr>
      <tr>
        <td id="L110" class="blob-num js-line-number" data-line-number="110"></td>
        <td id="LC110" class="blob-code blob-code-inner js-file-line">	<span class="pl-s"><span class="pl-pds">"</span>R_ID<span class="pl-pds">"</span></span> <span class="pl-k">VARCHAR2</span>(<span class="pl-c1">8</span>) <span class="pl-k">NOT NULL</span> ENABLE, </td>
      </tr>
      <tr>
        <td id="L111" class="blob-num js-line-number" data-line-number="111"></td>
        <td id="LC111" class="blob-code blob-code-inner js-file-line">	<span class="pl-s"><span class="pl-pds">"</span>PH_NO<span class="pl-pds">"</span></span> <span class="pl-k">NUMBER</span>(<span class="pl-c1">10</span>,<span class="pl-c1">0</span>) <span class="pl-k">NOT NULL</span> ENABLE, </td>
      </tr>
      <tr>
        <td id="L112" class="blob-num js-line-number" data-line-number="112"></td>
        <td id="LC112" class="blob-code blob-code-inner js-file-line">	<span class="pl-s"><span class="pl-pds">"</span>D_NAME<span class="pl-pds">"</span></span> <span class="pl-k">VARCHAR2</span>(<span class="pl-c1">20</span>), </td>
      </tr>
      <tr>
        <td id="L113" class="blob-num js-line-number" data-line-number="113"></td>
        <td id="LC113" class="blob-code blob-code-inner js-file-line">	<span class="pl-s"><span class="pl-pds">"</span>LAB_NO<span class="pl-pds">"</span></span> <span class="pl-k">NUMBER</span>(<span class="pl-c1">10</span>,<span class="pl-c1">0</span>), </td>
      </tr>
      <tr>
        <td id="L114" class="blob-num js-line-number" data-line-number="114"></td>
        <td id="LC114" class="blob-code blob-code-inner js-file-line">	<span class="pl-s"><span class="pl-pds">"</span>DISEASE<span class="pl-pds">"</span></span> <span class="pl-k">VARCHAR2</span>(<span class="pl-c1">25</span>), </td>
      </tr>
      <tr>
        <td id="L115" class="blob-num js-line-number" data-line-number="115"></td>
        <td id="LC115" class="blob-code blob-code-inner js-file-line">	 <span class="pl-k">CONSTRAINT</span> <span class="pl-s"><span class="pl-pds">"</span>PATIENT_PK<span class="pl-pds">"</span></span> <span class="pl-k">PRIMARY KEY</span> (<span class="pl-s"><span class="pl-pds">"</span>P_ID<span class="pl-pds">"</span></span>) ENABLE, </td>
      </tr>
      <tr>
        <td id="L116" class="blob-num js-line-number" data-line-number="116"></td>
        <td id="LC116" class="blob-code blob-code-inner js-file-line">	 <span class="pl-k">CONSTRAINT</span> <span class="pl-s"><span class="pl-pds">"</span>PATIENT_FK<span class="pl-pds">"</span></span> <span class="pl-k">FOREIGN KEY</span> (<span class="pl-s"><span class="pl-pds">"</span>DOCTOR_ID<span class="pl-pds">"</span></span>)</td>
      </tr>
      <tr>
        <td id="L117" class="blob-num js-line-number" data-line-number="117"></td>
        <td id="LC117" class="blob-code blob-code-inner js-file-line">	  <span class="pl-k">REFERENCES</span>  <span class="pl-s"><span class="pl-pds">"</span>DOCTOR<span class="pl-pds">"</span></span> (<span class="pl-s"><span class="pl-pds">"</span>D_ID<span class="pl-pds">"</span></span>) ENABLE, </td>
      </tr>
      <tr>
        <td id="L118" class="blob-num js-line-number" data-line-number="118"></td>
        <td id="LC118" class="blob-code blob-code-inner js-file-line">	 <span class="pl-k">CONSTRAINT</span> <span class="pl-s"><span class="pl-pds">"</span>PATIENT_FK2<span class="pl-pds">"</span></span> <span class="pl-k">FOREIGN KEY</span> (<span class="pl-s"><span class="pl-pds">"</span>R_ID<span class="pl-pds">"</span></span>)</td>
      </tr>
      <tr>
        <td id="L119" class="blob-num js-line-number" data-line-number="119"></td>
        <td id="LC119" class="blob-code blob-code-inner js-file-line">	  <span class="pl-k">REFERENCES</span>  <span class="pl-s"><span class="pl-pds">"</span>RECEPTIONIST<span class="pl-pds">"</span></span> (<span class="pl-s"><span class="pl-pds">"</span>R_ID<span class="pl-pds">"</span></span>) ENABLE, </td>
      </tr>
      <tr>
        <td id="L120" class="blob-num js-line-number" data-line-number="120"></td>
        <td id="LC120" class="blob-code blob-code-inner js-file-line">	 <span class="pl-k">CONSTRAINT</span> <span class="pl-s"><span class="pl-pds">"</span>PATIENT_CON<span class="pl-pds">"</span></span> <span class="pl-k">FOREIGN KEY</span> (<span class="pl-s"><span class="pl-pds">"</span>LAB_NO<span class="pl-pds">"</span></span>)</td>
      </tr>
      <tr>
        <td id="L121" class="blob-num js-line-number" data-line-number="121"></td>
        <td id="LC121" class="blob-code blob-code-inner js-file-line">	  <span class="pl-k">REFERENCES</span>  <span class="pl-s"><span class="pl-pds">"</span>LAB<span class="pl-pds">"</span></span> (<span class="pl-s"><span class="pl-pds">"</span>LAB_NO<span class="pl-pds">"</span></span>) ENABLE</td>
      </tr>
      <tr>
        <td id="L122" class="blob-num js-line-number" data-line-number="122"></td>
        <td id="LC122" class="blob-code blob-code-inner js-file-line">   )</td>
      </tr>
      <tr>
        <td id="L123" class="blob-num js-line-number" data-line-number="123"></td>
        <td id="LC123" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L124" class="blob-num js-line-number" data-line-number="124"></td>
        <td id="LC124" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L125" class="blob-num js-line-number" data-line-number="125"></td>
        <td id="LC125" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L126" class="blob-num js-line-number" data-line-number="126"></td>
        <td id="LC126" class="blob-code blob-code-inner js-file-line"><span class="pl-k">CREATE</span> <span class="pl-k">TABLE</span>  "<span class="pl-en">RADIOLOGY</span>" </td>
      </tr>
      <tr>
        <td id="L127" class="blob-num js-line-number" data-line-number="127"></td>
        <td id="LC127" class="blob-code blob-code-inner js-file-line">   (	<span class="pl-s"><span class="pl-pds">"</span>P_ID<span class="pl-pds">"</span></span> <span class="pl-k">VARCHAR2</span>(<span class="pl-c1">8</span>) <span class="pl-k">NOT NULL</span> ENABLE, </td>
      </tr>
      <tr>
        <td id="L128" class="blob-num js-line-number" data-line-number="128"></td>
        <td id="LC128" class="blob-code blob-code-inner js-file-line">	<span class="pl-s"><span class="pl-pds">"</span>P_NAME<span class="pl-pds">"</span></span> <span class="pl-k">VARCHAR2</span>(<span class="pl-c1">25</span>), </td>
      </tr>
      <tr>
        <td id="L129" class="blob-num js-line-number" data-line-number="129"></td>
        <td id="LC129" class="blob-code blob-code-inner js-file-line">	<span class="pl-s"><span class="pl-pds">"</span>D_ID<span class="pl-pds">"</span></span> <span class="pl-k">VARCHAR2</span>(<span class="pl-c1">8</span>) <span class="pl-k">NOT NULL</span> ENABLE, </td>
      </tr>
      <tr>
        <td id="L130" class="blob-num js-line-number" data-line-number="130"></td>
        <td id="LC130" class="blob-code blob-code-inner js-file-line">	<span class="pl-s"><span class="pl-pds">"</span>SCAN_NAME<span class="pl-pds">"</span></span> <span class="pl-k">VARCHAR2</span>(<span class="pl-c1">40</span>), </td>
      </tr>
      <tr>
        <td id="L131" class="blob-num js-line-number" data-line-number="131"></td>
        <td id="LC131" class="blob-code blob-code-inner js-file-line">	<span class="pl-s"><span class="pl-pds">"</span>BILL_AMOUNT<span class="pl-pds">"</span></span> <span class="pl-k">NUMBER</span>, </td>
      </tr>
      <tr>
        <td id="L132" class="blob-num js-line-number" data-line-number="132"></td>
        <td id="LC132" class="blob-code blob-code-inner js-file-line">	<span class="pl-s"><span class="pl-pds">"</span>D_NAME<span class="pl-pds">"</span></span> <span class="pl-k">VARCHAR2</span>(<span class="pl-c1">25</span>), </td>
      </tr>
      <tr>
        <td id="L133" class="blob-num js-line-number" data-line-number="133"></td>
        <td id="LC133" class="blob-code blob-code-inner js-file-line">	 <span class="pl-k">CONSTRAINT</span> <span class="pl-s"><span class="pl-pds">"</span>RADIOLOGY_PK<span class="pl-pds">"</span></span> <span class="pl-k">PRIMARY KEY</span> (<span class="pl-s"><span class="pl-pds">"</span>SCAN_NAME<span class="pl-pds">"</span></span>) DISABLE, </td>
      </tr>
      <tr>
        <td id="L134" class="blob-num js-line-number" data-line-number="134"></td>
        <td id="LC134" class="blob-code blob-code-inner js-file-line">	 <span class="pl-k">CONSTRAINT</span> <span class="pl-s"><span class="pl-pds">"</span>RADIOLOGY_FK<span class="pl-pds">"</span></span> <span class="pl-k">FOREIGN KEY</span> (<span class="pl-s"><span class="pl-pds">"</span>P_ID<span class="pl-pds">"</span></span>)</td>
      </tr>
      <tr>
        <td id="L135" class="blob-num js-line-number" data-line-number="135"></td>
        <td id="LC135" class="blob-code blob-code-inner js-file-line">	  <span class="pl-k">REFERENCES</span>  <span class="pl-s"><span class="pl-pds">"</span>PATIENT<span class="pl-pds">"</span></span> (<span class="pl-s"><span class="pl-pds">"</span>P_ID<span class="pl-pds">"</span></span>) ENABLE, </td>
      </tr>
      <tr>
        <td id="L136" class="blob-num js-line-number" data-line-number="136"></td>
        <td id="LC136" class="blob-code blob-code-inner js-file-line">	 <span class="pl-k">CONSTRAINT</span> <span class="pl-s"><span class="pl-pds">"</span>RADIOLOGY_FK3<span class="pl-pds">"</span></span> <span class="pl-k">FOREIGN KEY</span> (<span class="pl-s"><span class="pl-pds">"</span>D_ID<span class="pl-pds">"</span></span>)</td>
      </tr>
      <tr>
        <td id="L137" class="blob-num js-line-number" data-line-number="137"></td>
        <td id="LC137" class="blob-code blob-code-inner js-file-line">	  <span class="pl-k">REFERENCES</span>  <span class="pl-s"><span class="pl-pds">"</span>DOCTOR<span class="pl-pds">"</span></span> (<span class="pl-s"><span class="pl-pds">"</span>D_ID<span class="pl-pds">"</span></span>) ENABLE</td>
      </tr>
      <tr>
        <td id="L138" class="blob-num js-line-number" data-line-number="138"></td>
        <td id="LC138" class="blob-code blob-code-inner js-file-line">   )</td>
      </tr>
      <tr>
        <td id="L139" class="blob-num js-line-number" data-line-number="139"></td>
        <td id="LC139" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L140" class="blob-num js-line-number" data-line-number="140"></td>
        <td id="LC140" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L141" class="blob-num js-line-number" data-line-number="141"></td>
        <td id="LC141" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L142" class="blob-num js-line-number" data-line-number="142"></td>
        <td id="LC142" class="blob-code blob-code-inner js-file-line"><span class="pl-k">CREATE</span> <span class="pl-k">TABLE</span>  "<span class="pl-en">RADIOLOGY_DEPT</span>" </td>
      </tr>
      <tr>
        <td id="L143" class="blob-num js-line-number" data-line-number="143"></td>
        <td id="LC143" class="blob-code blob-code-inner js-file-line">   (	<span class="pl-s"><span class="pl-pds">"</span>RD_ID<span class="pl-pds">"</span></span> <span class="pl-k">VARCHAR2</span>(<span class="pl-c1">8</span>), </td>
      </tr>
      <tr>
        <td id="L144" class="blob-num js-line-number" data-line-number="144"></td>
        <td id="LC144" class="blob-code blob-code-inner js-file-line">	<span class="pl-s"><span class="pl-pds">"</span>RD_NAME<span class="pl-pds">"</span></span> <span class="pl-k">VARCHAR2</span>(<span class="pl-c1">25</span>), </td>
      </tr>
      <tr>
        <td id="L145" class="blob-num js-line-number" data-line-number="145"></td>
        <td id="LC145" class="blob-code blob-code-inner js-file-line">	<span class="pl-s"><span class="pl-pds">"</span>ADDRESS<span class="pl-pds">"</span></span> <span class="pl-k">VARCHAR2</span>(<span class="pl-c1">25</span>), </td>
      </tr>
      <tr>
        <td id="L146" class="blob-num js-line-number" data-line-number="146"></td>
        <td id="LC146" class="blob-code blob-code-inner js-file-line">	<span class="pl-s"><span class="pl-pds">"</span>BLOOD_GROUP<span class="pl-pds">"</span></span> <span class="pl-k">VARCHAR2</span>(<span class="pl-c1">4</span>), </td>
      </tr>
      <tr>
        <td id="L147" class="blob-num js-line-number" data-line-number="147"></td>
        <td id="LC147" class="blob-code blob-code-inner js-file-line">	<span class="pl-s"><span class="pl-pds">"</span>PH_NO<span class="pl-pds">"</span></span> <span class="pl-k">NUMBER</span>, </td>
      </tr>
      <tr>
        <td id="L148" class="blob-num js-line-number" data-line-number="148"></td>
        <td id="LC148" class="blob-code blob-code-inner js-file-line">	<span class="pl-s"><span class="pl-pds">"</span>PASSWORD<span class="pl-pds">"</span></span> <span class="pl-k">VARCHAR2</span>(<span class="pl-c1">8</span>), </td>
      </tr>
      <tr>
        <td id="L149" class="blob-num js-line-number" data-line-number="149"></td>
        <td id="LC149" class="blob-code blob-code-inner js-file-line">	 <span class="pl-k">PRIMARY KEY</span> (<span class="pl-s"><span class="pl-pds">"</span>RD_ID<span class="pl-pds">"</span></span>) ENABLE</td>
      </tr>
      <tr>
        <td id="L150" class="blob-num js-line-number" data-line-number="150"></td>
        <td id="LC150" class="blob-code blob-code-inner js-file-line">   )</td>
      </tr>
      <tr>
        <td id="L151" class="blob-num js-line-number" data-line-number="151"></td>
        <td id="LC151" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L152" class="blob-num js-line-number" data-line-number="152"></td>
        <td id="LC152" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L153" class="blob-num js-line-number" data-line-number="153"></td>
        <td id="LC153" class="blob-code blob-code-inner js-file-line"><span class="pl-k">CREATE</span> <span class="pl-k">TABLE</span>  "<span class="pl-en">RECEPTIONIST</span>" </td>
      </tr>
      <tr>
        <td id="L154" class="blob-num js-line-number" data-line-number="154"></td>
        <td id="LC154" class="blob-code blob-code-inner js-file-line">   (	<span class="pl-s"><span class="pl-pds">"</span>R_ID<span class="pl-pds">"</span></span> <span class="pl-k">VARCHAR2</span>(<span class="pl-c1">8</span>), </td>
      </tr>
      <tr>
        <td id="L155" class="blob-num js-line-number" data-line-number="155"></td>
        <td id="LC155" class="blob-code blob-code-inner js-file-line">	<span class="pl-s"><span class="pl-pds">"</span>R_NAME<span class="pl-pds">"</span></span> <span class="pl-k">VARCHAR2</span>(<span class="pl-c1">25</span>), </td>
      </tr>
      <tr>
        <td id="L156" class="blob-num js-line-number" data-line-number="156"></td>
        <td id="LC156" class="blob-code blob-code-inner js-file-line">	<span class="pl-s"><span class="pl-pds">"</span>R_ADDRESS<span class="pl-pds">"</span></span> <span class="pl-k">VARCHAR2</span>(<span class="pl-c1">25</span>), </td>
      </tr>
      <tr>
        <td id="L157" class="blob-num js-line-number" data-line-number="157"></td>
        <td id="LC157" class="blob-code blob-code-inner js-file-line">	<span class="pl-s"><span class="pl-pds">"</span>SALARY<span class="pl-pds">"</span></span> <span class="pl-k">NUMBER</span>, </td>
      </tr>
      <tr>
        <td id="L158" class="blob-num js-line-number" data-line-number="158"></td>
        <td id="LC158" class="blob-code blob-code-inner js-file-line">	<span class="pl-s"><span class="pl-pds">"</span>BLOOD_GROUP<span class="pl-pds">"</span></span> <span class="pl-k">VARCHAR2</span>(<span class="pl-c1">3</span>), </td>
      </tr>
      <tr>
        <td id="L159" class="blob-num js-line-number" data-line-number="159"></td>
        <td id="LC159" class="blob-code blob-code-inner js-file-line">	<span class="pl-s"><span class="pl-pds">"</span>PASSWORD<span class="pl-pds">"</span></span> <span class="pl-k">VARCHAR2</span>(<span class="pl-c1">12</span>), </td>
      </tr>
      <tr>
        <td id="L160" class="blob-num js-line-number" data-line-number="160"></td>
        <td id="LC160" class="blob-code blob-code-inner js-file-line">	<span class="pl-s"><span class="pl-pds">"</span>PH_NO<span class="pl-pds">"</span></span> <span class="pl-k">NUMBER</span>(<span class="pl-c1">10</span>,<span class="pl-c1">0</span>), </td>
      </tr>
      <tr>
        <td id="L161" class="blob-num js-line-number" data-line-number="161"></td>
        <td id="LC161" class="blob-code blob-code-inner js-file-line">	 <span class="pl-k">PRIMARY KEY</span> (<span class="pl-s"><span class="pl-pds">"</span>R_ID<span class="pl-pds">"</span></span>) ENABLE</td>
      </tr>
      <tr>
        <td id="L162" class="blob-num js-line-number" data-line-number="162"></td>
        <td id="LC162" class="blob-code blob-code-inner js-file-line">   )</td>
      </tr>
      <tr>
        <td id="L163" class="blob-num js-line-number" data-line-number="163"></td>
        <td id="LC163" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L164" class="blob-num js-line-number" data-line-number="164"></td>
        <td id="LC164" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L165" class="blob-num js-line-number" data-line-number="165"></td>
        <td id="LC165" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L166" class="blob-num js-line-number" data-line-number="166"></td>
        <td id="LC166" class="blob-code blob-code-inner js-file-line"><span class="pl-k">CREATE</span> <span class="pl-k">TABLE</span>  "<span class="pl-en">WARDS</span>" </td>
      </tr>
      <tr>
        <td id="L167" class="blob-num js-line-number" data-line-number="167"></td>
        <td id="LC167" class="blob-code blob-code-inner js-file-line">   (	<span class="pl-s"><span class="pl-pds">"</span>WARD_NO<span class="pl-pds">"</span></span> <span class="pl-k">NUMBER</span>, </td>
      </tr>
      <tr>
        <td id="L168" class="blob-num js-line-number" data-line-number="168"></td>
        <td id="LC168" class="blob-code blob-code-inner js-file-line">	<span class="pl-s"><span class="pl-pds">"</span>WARD_TYPE<span class="pl-pds">"</span></span> <span class="pl-k">VARCHAR2</span>(<span class="pl-c1">20</span>), </td>
      </tr>
      <tr>
        <td id="L169" class="blob-num js-line-number" data-line-number="169"></td>
        <td id="LC169" class="blob-code blob-code-inner js-file-line">	<span class="pl-s"><span class="pl-pds">"</span>TOTAL_BEDS<span class="pl-pds">"</span></span> <span class="pl-k">NUMBER</span>, </td>
      </tr>
      <tr>
        <td id="L170" class="blob-num js-line-number" data-line-number="170"></td>
        <td id="LC170" class="blob-code blob-code-inner js-file-line">	<span class="pl-s"><span class="pl-pds">"</span>OCCUPIED<span class="pl-pds">"</span></span> <span class="pl-k">NUMBER</span>, </td>
      </tr>
      <tr>
        <td id="L171" class="blob-num js-line-number" data-line-number="171"></td>
        <td id="LC171" class="blob-code blob-code-inner js-file-line">	<span class="pl-s"><span class="pl-pds">"</span>REMAINING<span class="pl-pds">"</span></span> <span class="pl-k">NUMBER</span>, </td>
      </tr>
      <tr>
        <td id="L172" class="blob-num js-line-number" data-line-number="172"></td>
        <td id="LC172" class="blob-code blob-code-inner js-file-line">	 <span class="pl-k">CONSTRAINT</span> <span class="pl-s"><span class="pl-pds">"</span>WARDS_PK<span class="pl-pds">"</span></span> <span class="pl-k">PRIMARY KEY</span> (<span class="pl-s"><span class="pl-pds">"</span>WARD_NO<span class="pl-pds">"</span></span>) ENABLE</td>
      </tr>
      <tr>
        <td id="L173" class="blob-num js-line-number" data-line-number="173"></td>
        <td id="LC173" class="blob-code blob-code-inner js-file-line">   )</td>
      </tr>
      <tr>
        <td id="L174" class="blob-num js-line-number" data-line-number="174"></td>
        <td id="LC174" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L175" class="blob-num js-line-number" data-line-number="175"></td>
        <td id="LC175" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L176" class="blob-num js-line-number" data-line-number="176"></td>
        <td id="LC176" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L177" class="blob-num js-line-number" data-line-number="177"></td>
        <td id="LC177" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L178" class="blob-num js-line-number" data-line-number="178"></td>
        <td id="LC178" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L179" class="blob-num js-line-number" data-line-number="179"></td>
        <td id="LC179" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L180" class="blob-num js-line-number" data-line-number="180"></td>
        <td id="LC180" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L181" class="blob-num js-line-number" data-line-number="181"></td>
        <td id="LC181" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L182" class="blob-num js-line-number" data-line-number="182"></td>
        <td id="LC182" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
</tbody></table>

  <details class="details-reset details-overlay BlobToolbar position-absolute js-file-line-actions dropdown d-none" aria-hidden="true">
    <summary class="btn-octicon ml-0 px-2 p-0 color-bg-primary border color-border-tertiary rounded-1" aria-label="Inline file action toolbar" aria-haspopup="menu" role="button">
      <svg class="octicon octicon-kebab-horizontal" height="16" viewBox="0 0 16 16" version="1.1" width="16" aria-hidden="true"><path d="M8 9a1.5 1.5 0 100-3 1.5 1.5 0 000 3zM1.5 9a1.5 1.5 0 100-3 1.5 1.5 0 000 3zm13 0a1.5 1.5 0 100-3 1.5 1.5 0 000 3z"></path></svg>
    </summary>
    <details-menu role="menu">
      <ul class="BlobToolbar-dropdown dropdown-menu dropdown-menu-se mt-2" style="width:185px">
        <li>
          <clipboard-copy role="menuitem" class="dropdown-item" id="js-copy-lines" style="cursor:pointer;" tabindex="0">
            Copy lines
          </clipboard-copy>
        </li>
        <li>
          <clipboard-copy role="menuitem" class="dropdown-item" id="js-copy-permalink" style="cursor:pointer;" tabindex="0">
            Copy permalink
          </clipboard-copy>
        </li>
        <li><a class="dropdown-item js-update-url-with-hash" id="js-view-git-blame" role="menuitem" href="https://github.com/Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM/blame/c93c97e1707f232da3de5b0c41a903d2a98e1b48/DBMS_QUERIES.sql">View git blame</a></li>
          <li><a class="dropdown-item" id="js-new-issue" role="menuitem" href="https://github.com/Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM/issues/new">Reference in new issue</a></li>
      </ul>
    </details-menu>
  </details>

  </div>

    </div>


  

  <details class="details-reset details-overlay details-overlay-dark" id="jumpto-line-details-dialog">
    <summary data-hotkey="l" aria-label="Jump to line" role="button"></summary>
    <details-dialog class="Box Box--overlay d-flex flex-column anim-fade-in fast linejump" aria-label="Jump to line" role="dialog" aria-modal="true">
      <!-- '"` --><!-- </textarea></xmp> --><form class="js-jump-to-line-form Box-body d-flex" action="https://github.com/Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM/blob/main/DBMS_QUERIES.sql" accept-charset="UTF-8" method="get">
        <input class="form-control flex-auto mr-3 linejump-input js-jump-to-line-field" type="text" placeholder="Jump to line…" aria-label="Jump to line" autofocus="">
        <button type="submit" class="btn" data-close-dialog="">Go</button>
</form>    </details-dialog>
  </details>


</div>















</div>
</div>

    </main>
  </div>

  </div>

          
<div class="footer container-xl width-full p-responsive" role="contentinfo">
  <div class="position-relative d-flex flex-row-reverse flex-lg-row flex-wrap flex-lg-nowrap flex-justify-center flex-lg-justify-between pt-6 pb-2 mt-6 f6 color-text-secondary border-top color-border-secondary ">
    <ul class="list-style-none d-flex flex-wrap col-12 col-lg-5 flex-justify-center flex-lg-justify-between mb-2 mb-lg-0">
      <li class="mr-3 mr-lg-0">© 2021 GitHub, Inc.</li>
        <li class="mr-3 mr-lg-0"><a href="https://docs.github.com/en/github/site-policy/github-terms-of-service" data-ga-click="Footer, go to terms, text:terms">Terms</a></li>
        <li class="mr-3 mr-lg-0"><a href="https://docs.github.com/en/github/site-policy/github-privacy-statement" data-ga-click="Footer, go to privacy, text:privacy">Privacy</a></li>
        <li class="mr-3 mr-lg-0"><a data-ga-click="Footer, go to security, text:security" href="https://github.com/security">Security</a></li>
        <li class="mr-3 mr-lg-0"><a href="https://www.githubstatus.com/" data-ga-click="Footer, go to status, text:status">Status</a></li>
        <li><a data-ga-click="Footer, go to help, text:Docs" href="https://docs.github.com/">Docs</a></li>
    </ul>

    <a aria-label="Homepage" title="GitHub" class="footer-octicon d-none d-lg-block mx-lg-4" href="https://github.com/">
      <svg height="24" class="octicon octicon-mark-github" viewBox="0 0 16 16" version="1.1" width="24" aria-hidden="true"><path fill-rule="evenodd" d="M8 0C3.58 0 0 3.58 0 8c0 3.54 2.29 6.53 5.47 7.59.4.07.55-.17.55-.38 0-.19-.01-.82-.01-1.49-2.01.37-2.53-.49-2.69-.94-.09-.23-.48-.94-.82-1.13-.28-.15-.68-.52-.01-.53.63-.01 1.08.58 1.23.82.72 1.21 1.87.87 2.33.66.07-.52.28-.87.51-1.07-1.78-.2-3.64-.89-3.64-3.95 0-.87.31-1.59.82-2.15-.08-.2-.36-1.02.08-2.12 0 0 .67-.21 2.2.82.64-.18 1.32-.27 2-.27.68 0 1.36.09 2 .27 1.53-1.04 2.2-.82 2.2-.82.44 1.1.16 1.92.08 2.12.51.56.82 1.27.82 2.15 0 3.07-1.87 3.75-3.65 3.95.29.25.54.73.54 1.48 0 1.07-.01 1.93-.01 2.2 0 .21.15.46.55.38A8.013 8.013 0 0016 8c0-4.42-3.58-8-8-8z"></path></svg>
</a>
    <ul class="list-style-none d-flex flex-wrap col-12 col-lg-5 flex-justify-center flex-lg-justify-between mb-2 mb-lg-0">
        <li class="mr-3 mr-lg-0"><a href="https://support.github.com/" data-ga-click="Footer, go to contact, text:contact">Contact GitHub</a></li>
        <li class="mr-3 mr-lg-0"><a href="https://github.com/pricing" data-ga-click="Footer, go to Pricing, text:Pricing">Pricing</a></li>
      <li class="mr-3 mr-lg-0"><a href="https://docs.github.com/" data-ga-click="Footer, go to api, text:api">API</a></li>
      <li class="mr-3 mr-lg-0"><a href="https://services.github.com/" data-ga-click="Footer, go to training, text:training">Training</a></li>
        <li class="mr-3 mr-lg-0"><a href="https://github.blog/" data-ga-click="Footer, go to blog, text:blog">Blog</a></li>
        <li><a data-ga-click="Footer, go to about, text:about" href="https://github.com/about">About</a></li>
    </ul>
  </div>
  <div class="d-flex flex-justify-center pb-6">
    <span class="f6 color-text-tertiary"></span>
  </div>

  
</div>



  <div id="ajax-error-message" class="ajax-error-message flash flash-error" hidden="">
    <svg class="octicon octicon-alert" height="16" viewBox="0 0 16 16" version="1.1" width="16" aria-hidden="true"><path fill-rule="evenodd" d="M8.22 1.754a.25.25 0 00-.44 0L1.698 13.132a.25.25 0 00.22.368h12.164a.25.25 0 00.22-.368L8.22 1.754zm-1.763-.707c.659-1.234 2.427-1.234 3.086 0l6.082 11.378A1.75 1.75 0 0114.082 15H1.918a1.75 1.75 0 01-1.543-2.575L6.457 1.047zM9 11a1 1 0 11-2 0 1 1 0 012 0zm-.25-5.25a.75.75 0 00-1.5 0v2.5a.75.75 0 001.5 0v-2.5z"></path></svg>
    <button type="button" class="flash-close js-ajax-error-dismiss" aria-label="Dismiss error">
      <svg class="octicon octicon-x" height="16" viewBox="0 0 16 16" version="1.1" width="16" aria-hidden="true"><path fill-rule="evenodd" d="M3.72 3.72a.75.75 0 011.06 0L8 6.94l3.22-3.22a.75.75 0 111.06 1.06L9.06 8l3.22 3.22a.75.75 0 11-1.06 1.06L8 9.06l-3.22 3.22a.75.75 0 01-1.06-1.06L6.94 8 3.72 4.78a.75.75 0 010-1.06z"></path></svg>
    </button>
    You can’t perform that action at this time.
  </div>

  <div class="js-stale-session-flash flash flash-warn flash-banner" hidden="">
    <svg class="octicon octicon-alert" height="16" viewBox="0 0 16 16" version="1.1" width="16" aria-hidden="true"><path fill-rule="evenodd" d="M8.22 1.754a.25.25 0 00-.44 0L1.698 13.132a.25.25 0 00.22.368h12.164a.25.25 0 00.22-.368L8.22 1.754zm-1.763-.707c.659-1.234 2.427-1.234 3.086 0l6.082 11.378A1.75 1.75 0 0114.082 15H1.918a1.75 1.75 0 01-1.543-2.575L6.457 1.047zM9 11a1 1 0 11-2 0 1 1 0 012 0zm-.25-5.25a.75.75 0 00-1.5 0v2.5a.75.75 0 001.5 0v-2.5z"></path></svg>
    <span class="js-stale-session-flash-signed-in" hidden="">You signed in with another tab or window. <a href="https://github.com/Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM/blob/main/DBMS_QUERIES.sql">Reload</a> to refresh your session.</span>
    <span class="js-stale-session-flash-signed-out" hidden="">You signed out in another tab or window. <a href="https://github.com/Puneeth-Aacharya/HOSPITAL-MANAGEMENT-SYSTEM/blob/main/DBMS_QUERIES.sql">Reload</a> to refresh your session.</span>
  </div>
    <template id="site-details-dialog"></template>

    <div class="Popover js-hovercard-content position-absolute" style="display: none; outline: none;" tabindex="0">
  <div class="Popover-message Popover-message--bottom-left Popover-message--large Box color-shadow-large" style="width:360px;"></div>
</div>



  

  


<div aria-live="polite" class="sr-only">Loading complete</div></body></html>