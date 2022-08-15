# RestfulWebServices
# OpenAPI definition

## <span id="__Methods">Methods</span>

\[ Jump to [Models](#__Models) \]

### Table of Contents

<div class="method-summary">

</div>

#### [HelloWordController](#HelloWordController)

  - [`get /hello-world`](#helloWorld)
  - [`get /hello-world-bean`](#helloWorldBean)

#### [UserJpaResource](#UserJpaResource)

  - [`post /jpa/users/{id}/posts`](#createPostForUser)
  - [`delete /jpa/users/{id}`](#deleteUser1)
  - [`get /jpa/users/{id}/posts`](#retrieveAllUserPosts)
  - [`get /jpa/users`](#retrieveAllUsers1)
  - [`get /jpa/users/{id}`](#retrieveUser1)
  - [`post /jpa/users`](#save1)

#### [UserResource](#UserResource)

  - [`delete /users/{id}`](#deleteUser)
  - [`get /users`](#retrieveAllUsers)
  - [`get /users/{id}`](#retrieveUser)
  - [`post /users`](#save)

# <span id="HelloWordController">HelloWordController</span>

<div class="method">

<span id="helloWorld"></span>

<div class="method-path">

[Up](#__Methods)

``` get
get /hello-world
```

</div>

<div class="method-summary">

(<span class="nickname">helloWorld</span>)

</div>

<div class="method-notes">

</div>

### Return type

<div class="return-type">

String

</div>

### Example data

<div class="example-data-content-type">

Content-Type: application/json

</div>

``` example
""
```

### Produces

This API call produces the following media types according to the
<span class="header">Accept</span> request header; the media type will
be conveyed by the <span class="header">Content-Type</span> response
header.

  - `*/*`

### Responses

#### 200

OK [String](#String)

</div>

-----

<div class="method">

<span id="helloWorldBean"></span>

<div class="method-path">

[Up](#__Methods)

``` get
get /hello-world-bean
```

</div>

<div class="method-summary">

(<span class="nickname">helloWorldBean</span>)

</div>

<div class="method-notes">

</div>

### Return type

<div class="return-type">

[HelloWorldBean](#HelloWorldBean)

</div>

### Example data

<div class="example-data-content-type">

Content-Type: application/json

</div>

``` example
{
  "message" : "message"
}
```

### Produces

This API call produces the following media types according to the
<span class="header">Accept</span> request header; the media type will
be conveyed by the <span class="header">Content-Type</span> response
header.

  - `*/*`

### Responses

#### 200

OK [HelloWorldBean](#HelloWorldBean)

</div>

-----

# <span id="UserJpaResource">UserJpaResource</span>

<div class="method">

<span id="createPostForUser"></span>

<div class="method-path">

[Up](#__Methods)

``` post
post /jpa/users/{id}/posts
```

</div>

<div class="method-summary">

(<span class="nickname">createPostForUser</span>)

</div>

<div class="method-notes">

</div>

### Path parameters

<div class="field-items">

<div class="param">

id (required)

</div>

<div class="param-desc">

<span class="param-type">Path Parameter</span> — format: int32

</div>

</div>

### Consumes

This API call consumes the following media types via the
<span class="header">Content-Type</span> request header:

  - `application/json`

### Request body

<div class="field-items">

<div class="param">

body [Post](#Post) (required)

</div>

<div class="param-desc">

<span class="param-type">Body Parameter</span> —

</div>

</div>

### Return type

<div class="return-type">

Object

</div>

### Example data

<div class="example-data-content-type">

Content-Type: application/json

</div>

``` example
{ }
```

### Produces

This API call produces the following media types according to the
<span class="header">Accept</span> request header; the media type will
be conveyed by the <span class="header">Content-Type</span> response
header.

  - `*/*`

### Responses

#### 200

OK [Object](#Object)

</div>

-----

<div class="method">

<span id="deleteUser1"></span>

<div class="method-path">

[Up](#__Methods)

``` delete
delete /jpa/users/{id}
```

</div>

<div class="method-summary">

(<span class="nickname">deleteUser1</span>)

</div>

<div class="method-notes">

</div>

### Path parameters

<div class="field-items">

<div class="param">

id (required)

</div>

<div class="param-desc">

<span class="param-type">Path Parameter</span> — format: int32

</div>

</div>

### Return type

<div class="return-type">

[User](#User)

</div>

### Example data

<div class="example-data-content-type">

Content-Type: application/json

</div>

``` example
{
  "name" : "name",
  "id" : 0,
  "birthDate" : "2000-01-23T04:56:07.000+00:00",
  "posts" : [ {
    "timeStamp" : "2000-01-23T04:56:07.000+00:00",
    "image" : "image",
    "description" : "description",
    "postId" : 6,
    "title" : "title"
  }, {
    "timeStamp" : "2000-01-23T04:56:07.000+00:00",
    "image" : "image",
    "description" : "description",
    "postId" : 6,
    "title" : "title"
  } ]
}
```

### Produces

This API call produces the following media types according to the
<span class="header">Accept</span> request header; the media type will
be conveyed by the <span class="header">Content-Type</span> response
header.

  - `*/*`

### Responses

#### 200

OK [User](#User)

</div>

-----

<div class="method">

<span id="retrieveAllUserPosts"></span>

<div class="method-path">

[Up](#__Methods)

``` get
get /jpa/users/{id}/posts
```

</div>

<div class="method-summary">

(<span class="nickname">retrieveAllUserPosts</span>)

</div>

<div class="method-notes">

</div>

### Path parameters

<div class="field-items">

<div class="param">

id (required)

</div>

<div class="param-desc">

<span class="param-type">Path Parameter</span> — format: int32

</div>

</div>

### Return type

<div class="return-type">

array\[[Post](#Post)\]

</div>

### Example data

<div class="example-data-content-type">

Content-Type: application/json

</div>

``` example
[ {
  "timeStamp" : "2000-01-23T04:56:07.000+00:00",
  "image" : "image",
  "description" : "description",
  "postId" : 6,
  "title" : "title"
}, {
  "timeStamp" : "2000-01-23T04:56:07.000+00:00",
  "image" : "image",
  "description" : "description",
  "postId" : 6,
  "title" : "title"
} ]
```

### Produces

This API call produces the following media types according to the
<span class="header">Accept</span> request header; the media type will
be conveyed by the <span class="header">Content-Type</span> response
header.

  - `*/*`

### Responses

#### 200

OK

</div>

-----

<div class="method">

<span id="retrieveAllUsers1"></span>

<div class="method-path">

[Up](#__Methods)

``` get
get /jpa/users
```

</div>

<div class="method-summary">

(<span class="nickname">retrieveAllUsers1</span>)

</div>

<div class="method-notes">

</div>

### Return type

<div class="return-type">

array\[[User](#User)\]

</div>

### Example data

<div class="example-data-content-type">

Content-Type: application/json

</div>

``` example
[ {
  "name" : "name",
  "id" : 0,
  "birthDate" : "2000-01-23T04:56:07.000+00:00",
  "posts" : [ {
    "timeStamp" : "2000-01-23T04:56:07.000+00:00",
    "image" : "image",
    "description" : "description",
    "postId" : 6,
    "title" : "title"
  }, {
    "timeStamp" : "2000-01-23T04:56:07.000+00:00",
    "image" : "image",
    "description" : "description",
    "postId" : 6,
    "title" : "title"
  } ]
}, {
  "name" : "name",
  "id" : 0,
  "birthDate" : "2000-01-23T04:56:07.000+00:00",
  "posts" : [ {
    "timeStamp" : "2000-01-23T04:56:07.000+00:00",
    "image" : "image",
    "description" : "description",
    "postId" : 6,
    "title" : "title"
  }, {
    "timeStamp" : "2000-01-23T04:56:07.000+00:00",
    "image" : "image",
    "description" : "description",
    "postId" : 6,
    "title" : "title"
  } ]
} ]
```

### Produces

This API call produces the following media types according to the
<span class="header">Accept</span> request header; the media type will
be conveyed by the <span class="header">Content-Type</span> response
header.

  - `*/*`

### Responses

#### 200

OK

</div>

-----

<div class="method">

<span id="retrieveUser1"></span>

<div class="method-path">

[Up](#__Methods)

``` get
get /jpa/users/{id}
```

</div>

<div class="method-summary">

(<span class="nickname">retrieveUser1</span>)

</div>

<div class="method-notes">

</div>

### Path parameters

<div class="field-items">

<div class="param">

id (required)

</div>

<div class="param-desc">

<span class="param-type">Path Parameter</span> — format: int32

</div>

</div>

### Return type

<div class="return-type">

[EntityModelUser](#EntityModelUser)

</div>

### Example data

<div class="example-data-content-type">

Content-Type: application/json

</div>

``` example
{
  "name" : "name",
  "links" : [ {
    "hreflang" : "hreflang",
    "profile" : "profile",
    "rel" : "rel",
    "name" : "name",
    "href" : "href",
    "media" : "media",
    "title" : "title",
    "type" : "type",
    "deprecation" : "deprecation"
  }, {
    "hreflang" : "hreflang",
    "profile" : "profile",
    "rel" : "rel",
    "name" : "name",
    "href" : "href",
    "media" : "media",
    "title" : "title",
    "type" : "type",
    "deprecation" : "deprecation"
  } ],
  "id" : 0,
  "birthDate" : "2000-01-23T04:56:07.000+00:00",
  "posts" : [ {
    "timeStamp" : "2000-01-23T04:56:07.000+00:00",
    "image" : "image",
    "description" : "description",
    "postId" : 6,
    "title" : "title"
  }, {
    "timeStamp" : "2000-01-23T04:56:07.000+00:00",
    "image" : "image",
    "description" : "description",
    "postId" : 6,
    "title" : "title"
  } ]
}
```

### Produces

This API call produces the following media types according to the
<span class="header">Accept</span> request header; the media type will
be conveyed by the <span class="header">Content-Type</span> response
header.

  - `*/*`

### Responses

#### 200

OK [EntityModelUser](#EntityModelUser)

</div>

-----

<div class="method">

<span id="save1"></span>

<div class="method-path">

[Up](#__Methods)

``` post
post /jpa/users
```

</div>

<div class="method-summary">

(<span class="nickname">save1</span>)

</div>

<div class="method-notes">

</div>

### Consumes

This API call consumes the following media types via the
<span class="header">Content-Type</span> request header:

  - `application/json`

### Request body

<div class="field-items">

<div class="param">

body [User](#User) (required)

</div>

<div class="param-desc">

<span class="param-type">Body Parameter</span> —

</div>

</div>

### Return type

<div class="return-type">

Object

</div>

### Example data

<div class="example-data-content-type">

Content-Type: application/json

</div>

``` example
{ }
```

### Produces

This API call produces the following media types according to the
<span class="header">Accept</span> request header; the media type will
be conveyed by the <span class="header">Content-Type</span> response
header.

  - `*/*`

### Responses

#### 200

OK [Object](#Object)

</div>

-----

# <span id="UserResource">UserResource</span>

<div class="method">

<span id="deleteUser"></span>

<div class="method-path">

[Up](#__Methods)

``` delete
delete /users/{id}
```

</div>

<div class="method-summary">

(<span class="nickname">deleteUser</span>)

</div>

<div class="method-notes">

</div>

### Path parameters

<div class="field-items">

<div class="param">

id (required)

</div>

<div class="param-desc">

<span class="param-type">Path Parameter</span> — format: int32

</div>

</div>

### Return type

<div class="return-type">

[User](#User)

</div>

### Example data

<div class="example-data-content-type">

Content-Type: application/json

</div>

``` example
{
  "name" : "name",
  "id" : 0,
  "birthDate" : "2000-01-23T04:56:07.000+00:00",
  "posts" : [ {
    "timeStamp" : "2000-01-23T04:56:07.000+00:00",
    "image" : "image",
    "description" : "description",
    "postId" : 6,
    "title" : "title"
  }, {
    "timeStamp" : "2000-01-23T04:56:07.000+00:00",
    "image" : "image",
    "description" : "description",
    "postId" : 6,
    "title" : "title"
  } ]
}
```

### Produces

This API call produces the following media types according to the
<span class="header">Accept</span> request header; the media type will
be conveyed by the <span class="header">Content-Type</span> response
header.

  - `*/*`

### Responses

#### 200

OK [User](#User)

</div>

-----

<div class="method">

<span id="retrieveAllUsers"></span>

<div class="method-path">

[Up](#__Methods)

``` get
get /users
```

</div>

<div class="method-summary">

(<span class="nickname">retrieveAllUsers</span>)

</div>

<div class="method-notes">

</div>

### Return type

<div class="return-type">

array\[[User](#User)\]

</div>

### Example data

<div class="example-data-content-type">

Content-Type: application/json

</div>

``` example
[ {
  "name" : "name",
  "id" : 0,
  "birthDate" : "2000-01-23T04:56:07.000+00:00",
  "posts" : [ {
    "timeStamp" : "2000-01-23T04:56:07.000+00:00",
    "image" : "image",
    "description" : "description",
    "postId" : 6,
    "title" : "title"
  }, {
    "timeStamp" : "2000-01-23T04:56:07.000+00:00",
    "image" : "image",
    "description" : "description",
    "postId" : 6,
    "title" : "title"
  } ]
}, {
  "name" : "name",
  "id" : 0,
  "birthDate" : "2000-01-23T04:56:07.000+00:00",
  "posts" : [ {
    "timeStamp" : "2000-01-23T04:56:07.000+00:00",
    "image" : "image",
    "description" : "description",
    "postId" : 6,
    "title" : "title"
  }, {
    "timeStamp" : "2000-01-23T04:56:07.000+00:00",
    "image" : "image",
    "description" : "description",
    "postId" : 6,
    "title" : "title"
  } ]
} ]
```

### Produces

This API call produces the following media types according to the
<span class="header">Accept</span> request header; the media type will
be conveyed by the <span class="header">Content-Type</span> response
header.

  - `*/*`

### Responses

#### 200

OK

</div>

-----

<div class="method">

<span id="retrieveUser"></span>

<div class="method-path">

[Up](#__Methods)

``` get
get /users/{id}
```

</div>

<div class="method-summary">

(<span class="nickname">retrieveUser</span>)

</div>

<div class="method-notes">

</div>

### Path parameters

<div class="field-items">

<div class="param">

id (required)

</div>

<div class="param-desc">

<span class="param-type">Path Parameter</span> — format: int32

</div>

</div>

### Return type

<div class="return-type">

[EntityModelUser](#EntityModelUser)

</div>

### Example data

<div class="example-data-content-type">

Content-Type: application/json

</div>

``` example
{
  "name" : "name",
  "links" : [ {
    "hreflang" : "hreflang",
    "profile" : "profile",
    "rel" : "rel",
    "name" : "name",
    "href" : "href",
    "media" : "media",
    "title" : "title",
    "type" : "type",
    "deprecation" : "deprecation"
  }, {
    "hreflang" : "hreflang",
    "profile" : "profile",
    "rel" : "rel",
    "name" : "name",
    "href" : "href",
    "media" : "media",
    "title" : "title",
    "type" : "type",
    "deprecation" : "deprecation"
  } ],
  "id" : 0,
  "birthDate" : "2000-01-23T04:56:07.000+00:00",
  "posts" : [ {
    "timeStamp" : "2000-01-23T04:56:07.000+00:00",
    "image" : "image",
    "description" : "description",
    "postId" : 6,
    "title" : "title"
  }, {
    "timeStamp" : "2000-01-23T04:56:07.000+00:00",
    "image" : "image",
    "description" : "description",
    "postId" : 6,
    "title" : "title"
  } ]
}
```

### Produces

This API call produces the following media types according to the
<span class="header">Accept</span> request header; the media type will
be conveyed by the <span class="header">Content-Type</span> response
header.

  - `*/*`

### Responses

#### 200

OK [EntityModelUser](#EntityModelUser)

</div>

-----

<div class="method">

<span id="save"></span>

<div class="method-path">

[Up](#__Methods)

``` post
post /users
```

</div>

<div class="method-summary">

(<span class="nickname">save</span>)

</div>

<div class="method-notes">

</div>

### Consumes

This API call consumes the following media types via the
<span class="header">Content-Type</span> request header:

  - `application/json`

### Request body

<div class="field-items">

<div class="param">

body [User](#User) (required)

</div>

<div class="param-desc">

<span class="param-type">Body Parameter</span> —

</div>

</div>

### Return type

<div class="return-type">

Object

</div>

### Example data

<div class="example-data-content-type">

Content-Type: application/json

</div>

``` example
{ }
```

### Produces

This API call produces the following media types according to the
<span class="header">Accept</span> request header; the media type will
be conveyed by the <span class="header">Content-Type</span> response
header.

  - `*/*`

### Responses

#### 200

OK [Object](#Object)

</div>

-----

## <span id="__Models">Models</span>

\[ Jump to [Methods](#__Methods) \]

### Table of Contents

1.  [`EntityModelUser`](#EntityModelUser)
2.  [`HelloWorldBean`](#HelloWorldBean)
3.  [`Link`](#Link)
4.  [`Post`](#Post)
5.  [`User`](#User)

<div class="model">

### <span id="EntityModelUser">`EntityModelUser`</span> [Up](#__Models)

<div class="field-items">

<div class="param">

id (optional)

</div>

<div class="param-desc">

<span class="param-type">[Integer](#integer)</span> format: int32

</div>

<div class="param">

name (optional)

</div>

<div class="param-desc">

<span class="param-type">[String](#string)</span>

</div>

<div class="param">

birthDate (optional)

</div>

<div class="param-desc">

<span class="param-type">[Date](#DateTime)</span> format: date-time

</div>

<div class="param">

posts (optional)

</div>

<div class="param-desc">

<span class="param-type">[array\[Post\]](#Post)</span>

</div>

<div class="param">

links (optional)

</div>

<div class="param-desc">

<span class="param-type">[array\[Link\]](#Link)</span>

</div>

</div>

</div>

<div class="model">

### <span id="HelloWorldBean">`HelloWorldBean`</span> [Up](#__Models)

<div class="field-items">

<div class="param">

message (optional)

</div>

<div class="param-desc">

<span class="param-type">[String](#string)</span>

</div>

</div>

</div>

<div class="model">

### <span id="Link">`Link`</span> [Up](#__Models)

<div class="field-items">

<div class="param">

rel (optional)

</div>

<div class="param-desc">

<span class="param-type">[String](#string)</span>

</div>

<div class="param">

href (optional)

</div>

<div class="param-desc">

<span class="param-type">[String](#string)</span>

</div>

<div class="param">

hreflang (optional)

</div>

<div class="param-desc">

<span class="param-type">[String](#string)</span>

</div>

<div class="param">

media (optional)

</div>

<div class="param-desc">

<span class="param-type">[String](#string)</span>

</div>

<div class="param">

title (optional)

</div>

<div class="param-desc">

<span class="param-type">[String](#string)</span>

</div>

<div class="param">

type (optional)

</div>

<div class="param-desc">

<span class="param-type">[String](#string)</span>

</div>

<div class="param">

deprecation (optional)

</div>

<div class="param-desc">

<span class="param-type">[String](#string)</span>

</div>

<div class="param">

profile (optional)

</div>

<div class="param-desc">

<span class="param-type">[String](#string)</span>

</div>

<div class="param">

name (optional)

</div>

<div class="param-desc">

<span class="param-type">[String](#string)</span>

</div>

</div>

</div>

<div class="model">

### <span id="Post">`Post`</span> [Up](#__Models)

<div class="field-items">

<div class="param">

postId (optional)

</div>

<div class="param-desc">

<span class="param-type">[Integer](#integer)</span> format: int32

</div>

<div class="param">

title (optional)

</div>

<div class="param-desc">

<span class="param-type">[String](#string)</span>

</div>

<div class="param">

description (optional)

</div>

<div class="param-desc">

<span class="param-type">[String](#string)</span>

</div>

<div class="param">

image (optional)

</div>

<div class="param-desc">

<span class="param-type">[String](#string)</span>

</div>

<div class="param">

timeStamp (optional)

</div>

<div class="param-desc">

<span class="param-type">[Date](#DateTime)</span> format: date-time

</div>

</div>

</div>

<div class="model">

### <span id="User">`User`</span> [Up](#__Models)

<div class="field-items">

<div class="param">

id (optional)

</div>

<div class="param-desc">

<span class="param-type">[Integer](#integer)</span> format: int32

</div>

<div class="param">

name (optional)

</div>

<div class="param-desc">

<span class="param-type">[String](#string)</span>

</div>

<div class="param">

birthDate (optional)

</div>

<div class="param-desc">

<span class="param-type">[Date](#DateTime)</span> format: date-time

</div>

<div class="param">

posts (optional)

</div>

<div class="param-desc">

<span class="param-type">[array\[Post\]](#Post)</span>

</div>

</div>

</div>

<div class="app-desc">

(generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)

</div>
